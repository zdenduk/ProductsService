package product;

import com.alswa.products.ProductOuterClass;
import com.alswa.products.productsGrpc;
import io.grpc.stub.StreamObserver;

import java.sql.*;

public class ProductService extends productsGrpc.productsImplBase {

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
    public void create(ProductOuterClass.Product request, StreamObserver<ProductOuterClass.Empty> responseObserver) {
        String id = request.getId();
        String name = request.getName();
        int price = request.getPrice();

        ProductOuterClass.Product product = ProductOuterClass.Product.newBuilder().setId(id).setName(name).setPrice(price).build();
        try {
            PreparedStatement st = addProduct(product);
            st.executeUpdate();

            System.out.println("values inserted");
        } catch (Exception e) {
            e.printStackTrace();
        }

        responseObserver.onNext(ProductOuterClass.Empty.newBuilder().build());
        responseObserver.onCompleted();
    }

    @Override
    public void edit(ProductOuterClass.Product request, StreamObserver<ProductOuterClass.Product> responseObserver) {

    }

    @Override
    public void delete(ProductOuterClass.DefaultRequest request, StreamObserver<ProductOuterClass.Empty> responseObserver) {
        String pid = request.getId();
        String sql = "delete from products where id=" + pid;
        PreparedStatement stmt;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection cons = DriverManager.getConnection("jdbc:mysql://localhost:3306/maven", "root", "root");
            stmt = cons.prepareStatement(sql);
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }

        responseObserver.onNext(ProductOuterClass.Empty.newBuilder().build());
        responseObserver.onCompleted();
    }

    private static ResultSet getProductsById(String id) {

        ResultSet rSet = null;
        try {
            String sql = "select * from products where id=" + id;
            Class.forName("com.mysql.jdbc.Driver");
            Connection cons = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/maven", "root", "root");
            Statement stmt = cons.createStatement();
            rSet = stmt.executeQuery(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rSet;
    }

    private PreparedStatement addProduct(ProductOuterClass.Product product) {
        String sql = "INSERT INTO products(NAME, price, stock) VALUES(?,?,?)";
        PreparedStatement st = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection cons = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/maven", "root", "root");
            st = (PreparedStatement) cons.prepareStatement(sql);
            st.setString(1, product.getId());
            st.setString(2, product.getName());
            st.setInt(3, product.getPrice());
            return st;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
