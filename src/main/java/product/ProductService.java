package product;

import com.alswa.products.ProductOuterClass;
import com.alswa.products.ProductServiceGrpc;
import com.google.rpc.Status;
import io.grpc.protobuf.StatusProto;
import io.grpc.stub.StreamObserver;

import java.sql.*;

public class ProductService extends ProductServiceGrpc.ProductServiceImplBase {

    static final boolean PROD = "production".equals(System.getenv("JAVA_ENV"));
    static final String DB_URL = "jdbc:postgresql://" + (PROD ? "product-db:5432" : "localhost:3306") + "/products";
    static final String DB_USER = "postgres";
    static final String DB_PWD = "postgres";

    @Override
    public void fetch(ProductOuterClass.DefaultRequest request, StreamObserver<ProductOuterClass.Product> responseObserver) {
        String pid = request.getId();
        ProductOuterClass.Product product = null;

        try {
            ResultSet rSet = getProductsById(pid);

            while (rSet.next()) {
                product = ProductOuterClass.Product.newBuilder().setId(rSet.getString(1)).setName(rSet.getString(2)).setPrice(rSet.getInt(3)).build();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        responseObserver.onNext(product);
        responseObserver.onCompleted();
    }

    @Override
    public void create(ProductOuterClass.ProductParams request, StreamObserver<ProductOuterClass.Empty> responseObserver) {
        String name = request.getName();
        int price = request.getPrice();

        ProductOuterClass.ProductParams product = ProductOuterClass.ProductParams.newBuilder().setName(name).setPrice(price).build();
        try {
            PreparedStatement st = addProduct(product);
            st.executeUpdate();

            System.out.println("Product created");
        } catch (Exception e) {
            Status status = Status.newBuilder()
                    .setMessage(e.getMessage())
                    .build();
            responseObserver.onError(StatusProto.toStatusRuntimeException(status));

            e.printStackTrace();
        }

        responseObserver.onNext(ProductOuterClass.Empty.newBuilder().build());
        responseObserver.onCompleted();
    }

    @Override
    public void edit(ProductOuterClass.Product request, StreamObserver<ProductOuterClass.Product> responseObserver) {
        // TODO
    }

    @Override
    public void delete(ProductOuterClass.DefaultRequest request, StreamObserver<ProductOuterClass.Empty> responseObserver) {
        String pid = request.getId();
        String sql = "delete from products where id=" + pid;
        PreparedStatement stmt;
        try {
            Class.forName("org.postgresql.Driver");
            Connection cons = DriverManager.getConnection(DB_URL, DB_USER, DB_PWD);
            stmt = cons.prepareStatement(sql);
            stmt.executeUpdate();
        } catch (Exception e) {
            Status status = Status.newBuilder()
                    .setMessage(e.getMessage())
                    .build();
            responseObserver.onError(StatusProto.toStatusRuntimeException(status));

            e.printStackTrace();
        }

        responseObserver.onNext(ProductOuterClass.Empty.newBuilder().build());
        responseObserver.onCompleted();
    }

    private static ResultSet getProductsById(String id) {

        ResultSet rSet = null;
        try {
            String sql = "select * from products where id=" + id;
            Class.forName("org.postgresql.Driver");
            Connection cons = DriverManager.getConnection(DB_URL, DB_USER, DB_PWD);
            Statement stmt = cons.createStatement();
            rSet = stmt.executeQuery(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rSet;
    }

    private PreparedStatement addProduct(ProductOuterClass.ProductParams product) {
        String sql = "INSERT INTO products(NAME, price) VALUES(?,?)";
        PreparedStatement st = null;
        try {
            Class.forName("org.postgresql.Driver");
            Connection cons = DriverManager.getConnection(DB_URL, DB_USER, DB_PWD);
            st = cons.prepareStatement(sql);
            st.setString(1, product.getName());
            st.setInt(2, product.getPrice());
            return st;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
