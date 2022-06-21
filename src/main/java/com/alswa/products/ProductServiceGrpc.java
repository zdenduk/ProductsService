package com.alswa.products;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: product.proto")
public final class ProductServiceGrpc {

  private ProductServiceGrpc() {}

  public static final String SERVICE_NAME = "com.alswa.products.ProductService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.alswa.products.ProductOuterClass.DefaultRequest,
      com.alswa.products.ProductOuterClass.Product> getFetchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Fetch",
      requestType = com.alswa.products.ProductOuterClass.DefaultRequest.class,
      responseType = com.alswa.products.ProductOuterClass.Product.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.alswa.products.ProductOuterClass.DefaultRequest,
      com.alswa.products.ProductOuterClass.Product> getFetchMethod() {
    io.grpc.MethodDescriptor<com.alswa.products.ProductOuterClass.DefaultRequest, com.alswa.products.ProductOuterClass.Product> getFetchMethod;
    if ((getFetchMethod = ProductServiceGrpc.getFetchMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getFetchMethod = ProductServiceGrpc.getFetchMethod) == null) {
          ProductServiceGrpc.getFetchMethod = getFetchMethod = 
              io.grpc.MethodDescriptor.<com.alswa.products.ProductOuterClass.DefaultRequest, com.alswa.products.ProductOuterClass.Product>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.alswa.products.ProductService", "Fetch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.alswa.products.ProductOuterClass.DefaultRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.alswa.products.ProductOuterClass.Product.getDefaultInstance()))
                  .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("Fetch"))
                  .build();
          }
        }
     }
     return getFetchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.alswa.products.ProductOuterClass.ProductParams,
      com.alswa.products.ProductOuterClass.Empty> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = com.alswa.products.ProductOuterClass.ProductParams.class,
      responseType = com.alswa.products.ProductOuterClass.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.alswa.products.ProductOuterClass.ProductParams,
      com.alswa.products.ProductOuterClass.Empty> getCreateMethod() {
    io.grpc.MethodDescriptor<com.alswa.products.ProductOuterClass.ProductParams, com.alswa.products.ProductOuterClass.Empty> getCreateMethod;
    if ((getCreateMethod = ProductServiceGrpc.getCreateMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getCreateMethod = ProductServiceGrpc.getCreateMethod) == null) {
          ProductServiceGrpc.getCreateMethod = getCreateMethod = 
              io.grpc.MethodDescriptor.<com.alswa.products.ProductOuterClass.ProductParams, com.alswa.products.ProductOuterClass.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.alswa.products.ProductService", "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.alswa.products.ProductOuterClass.ProductParams.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.alswa.products.ProductOuterClass.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("Create"))
                  .build();
          }
        }
     }
     return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.alswa.products.ProductOuterClass.Product,
      com.alswa.products.ProductOuterClass.Product> getEditMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Edit",
      requestType = com.alswa.products.ProductOuterClass.Product.class,
      responseType = com.alswa.products.ProductOuterClass.Product.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.alswa.products.ProductOuterClass.Product,
      com.alswa.products.ProductOuterClass.Product> getEditMethod() {
    io.grpc.MethodDescriptor<com.alswa.products.ProductOuterClass.Product, com.alswa.products.ProductOuterClass.Product> getEditMethod;
    if ((getEditMethod = ProductServiceGrpc.getEditMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getEditMethod = ProductServiceGrpc.getEditMethod) == null) {
          ProductServiceGrpc.getEditMethod = getEditMethod = 
              io.grpc.MethodDescriptor.<com.alswa.products.ProductOuterClass.Product, com.alswa.products.ProductOuterClass.Product>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.alswa.products.ProductService", "Edit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.alswa.products.ProductOuterClass.Product.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.alswa.products.ProductOuterClass.Product.getDefaultInstance()))
                  .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("Edit"))
                  .build();
          }
        }
     }
     return getEditMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.alswa.products.ProductOuterClass.DefaultRequest,
      com.alswa.products.ProductOuterClass.Empty> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = com.alswa.products.ProductOuterClass.DefaultRequest.class,
      responseType = com.alswa.products.ProductOuterClass.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.alswa.products.ProductOuterClass.DefaultRequest,
      com.alswa.products.ProductOuterClass.Empty> getDeleteMethod() {
    io.grpc.MethodDescriptor<com.alswa.products.ProductOuterClass.DefaultRequest, com.alswa.products.ProductOuterClass.Empty> getDeleteMethod;
    if ((getDeleteMethod = ProductServiceGrpc.getDeleteMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getDeleteMethod = ProductServiceGrpc.getDeleteMethod) == null) {
          ProductServiceGrpc.getDeleteMethod = getDeleteMethod = 
              io.grpc.MethodDescriptor.<com.alswa.products.ProductOuterClass.DefaultRequest, com.alswa.products.ProductOuterClass.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.alswa.products.ProductService", "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.alswa.products.ProductOuterClass.DefaultRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.alswa.products.ProductOuterClass.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("Delete"))
                  .build();
          }
        }
     }
     return getDeleteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProductServiceStub newStub(io.grpc.Channel channel) {
    return new ProductServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProductServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ProductServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProductServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ProductServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ProductServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void fetch(com.alswa.products.ProductOuterClass.DefaultRequest request,
        io.grpc.stub.StreamObserver<com.alswa.products.ProductOuterClass.Product> responseObserver) {
      asyncUnimplementedUnaryCall(getFetchMethod(), responseObserver);
    }

    /**
     */
    public void create(com.alswa.products.ProductOuterClass.ProductParams request,
        io.grpc.stub.StreamObserver<com.alswa.products.ProductOuterClass.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     */
    public void edit(com.alswa.products.ProductOuterClass.Product request,
        io.grpc.stub.StreamObserver<com.alswa.products.ProductOuterClass.Product> responseObserver) {
      asyncUnimplementedUnaryCall(getEditMethod(), responseObserver);
    }

    /**
     */
    public void delete(com.alswa.products.ProductOuterClass.DefaultRequest request,
        io.grpc.stub.StreamObserver<com.alswa.products.ProductOuterClass.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getFetchMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.alswa.products.ProductOuterClass.DefaultRequest,
                com.alswa.products.ProductOuterClass.Product>(
                  this, METHODID_FETCH)))
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.alswa.products.ProductOuterClass.ProductParams,
                com.alswa.products.ProductOuterClass.Empty>(
                  this, METHODID_CREATE)))
          .addMethod(
            getEditMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.alswa.products.ProductOuterClass.Product,
                com.alswa.products.ProductOuterClass.Product>(
                  this, METHODID_EDIT)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.alswa.products.ProductOuterClass.DefaultRequest,
                com.alswa.products.ProductOuterClass.Empty>(
                  this, METHODID_DELETE)))
          .build();
    }
  }

  /**
   */
  public static final class ProductServiceStub extends io.grpc.stub.AbstractStub<ProductServiceStub> {
    private ProductServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProductServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProductServiceStub(channel, callOptions);
    }

    /**
     */
    public void fetch(com.alswa.products.ProductOuterClass.DefaultRequest request,
        io.grpc.stub.StreamObserver<com.alswa.products.ProductOuterClass.Product> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFetchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void create(com.alswa.products.ProductOuterClass.ProductParams request,
        io.grpc.stub.StreamObserver<com.alswa.products.ProductOuterClass.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void edit(com.alswa.products.ProductOuterClass.Product request,
        io.grpc.stub.StreamObserver<com.alswa.products.ProductOuterClass.Product> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEditMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(com.alswa.products.ProductOuterClass.DefaultRequest request,
        io.grpc.stub.StreamObserver<com.alswa.products.ProductOuterClass.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ProductServiceBlockingStub extends io.grpc.stub.AbstractStub<ProductServiceBlockingStub> {
    private ProductServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProductServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProductServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.alswa.products.ProductOuterClass.Product fetch(com.alswa.products.ProductOuterClass.DefaultRequest request) {
      return blockingUnaryCall(
          getChannel(), getFetchMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.alswa.products.ProductOuterClass.Empty create(com.alswa.products.ProductOuterClass.ProductParams request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.alswa.products.ProductOuterClass.Product edit(com.alswa.products.ProductOuterClass.Product request) {
      return blockingUnaryCall(
          getChannel(), getEditMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.alswa.products.ProductOuterClass.Empty delete(com.alswa.products.ProductOuterClass.DefaultRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ProductServiceFutureStub extends io.grpc.stub.AbstractStub<ProductServiceFutureStub> {
    private ProductServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProductServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProductServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.alswa.products.ProductOuterClass.Product> fetch(
        com.alswa.products.ProductOuterClass.DefaultRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFetchMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.alswa.products.ProductOuterClass.Empty> create(
        com.alswa.products.ProductOuterClass.ProductParams request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.alswa.products.ProductOuterClass.Product> edit(
        com.alswa.products.ProductOuterClass.Product request) {
      return futureUnaryCall(
          getChannel().newCall(getEditMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.alswa.products.ProductOuterClass.Empty> delete(
        com.alswa.products.ProductOuterClass.DefaultRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FETCH = 0;
  private static final int METHODID_CREATE = 1;
  private static final int METHODID_EDIT = 2;
  private static final int METHODID_DELETE = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ProductServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ProductServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FETCH:
          serviceImpl.fetch((com.alswa.products.ProductOuterClass.DefaultRequest) request,
              (io.grpc.stub.StreamObserver<com.alswa.products.ProductOuterClass.Product>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((com.alswa.products.ProductOuterClass.ProductParams) request,
              (io.grpc.stub.StreamObserver<com.alswa.products.ProductOuterClass.Empty>) responseObserver);
          break;
        case METHODID_EDIT:
          serviceImpl.edit((com.alswa.products.ProductOuterClass.Product) request,
              (io.grpc.stub.StreamObserver<com.alswa.products.ProductOuterClass.Product>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((com.alswa.products.ProductOuterClass.DefaultRequest) request,
              (io.grpc.stub.StreamObserver<com.alswa.products.ProductOuterClass.Empty>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ProductServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProductServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.alswa.products.ProductOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ProductService");
    }
  }

  private static final class ProductServiceFileDescriptorSupplier
      extends ProductServiceBaseDescriptorSupplier {
    ProductServiceFileDescriptorSupplier() {}
  }

  private static final class ProductServiceMethodDescriptorSupplier
      extends ProductServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ProductServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ProductServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProductServiceFileDescriptorSupplier())
              .addMethod(getFetchMethod())
              .addMethod(getCreateMethod())
              .addMethod(getEditMethod())
              .addMethod(getDeleteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
