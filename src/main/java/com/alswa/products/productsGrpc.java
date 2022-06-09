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
public final class productsGrpc {

  private productsGrpc() {}

  public static final String SERVICE_NAME = "products";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.alswa.products.ProductOuterClass.DefaultRequest,
      com.alswa.products.ProductOuterClass.Product> getFetchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "fetch",
      requestType = com.alswa.products.ProductOuterClass.DefaultRequest.class,
      responseType = com.alswa.products.ProductOuterClass.Product.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.alswa.products.ProductOuterClass.DefaultRequest,
      com.alswa.products.ProductOuterClass.Product> getFetchMethod() {
    io.grpc.MethodDescriptor<com.alswa.products.ProductOuterClass.DefaultRequest, com.alswa.products.ProductOuterClass.Product> getFetchMethod;
    if ((getFetchMethod = productsGrpc.getFetchMethod) == null) {
      synchronized (productsGrpc.class) {
        if ((getFetchMethod = productsGrpc.getFetchMethod) == null) {
          productsGrpc.getFetchMethod = getFetchMethod = 
              io.grpc.MethodDescriptor.<com.alswa.products.ProductOuterClass.DefaultRequest, com.alswa.products.ProductOuterClass.Product>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "products", "fetch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.alswa.products.ProductOuterClass.DefaultRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.alswa.products.ProductOuterClass.Product.getDefaultInstance()))
                  .setSchemaDescriptor(new productsMethodDescriptorSupplier("fetch"))
                  .build();
          }
        }
     }
     return getFetchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.alswa.products.ProductOuterClass.Product,
      com.alswa.products.ProductOuterClass.Empty> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "create",
      requestType = com.alswa.products.ProductOuterClass.Product.class,
      responseType = com.alswa.products.ProductOuterClass.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.alswa.products.ProductOuterClass.Product,
      com.alswa.products.ProductOuterClass.Empty> getCreateMethod() {
    io.grpc.MethodDescriptor<com.alswa.products.ProductOuterClass.Product, com.alswa.products.ProductOuterClass.Empty> getCreateMethod;
    if ((getCreateMethod = productsGrpc.getCreateMethod) == null) {
      synchronized (productsGrpc.class) {
        if ((getCreateMethod = productsGrpc.getCreateMethod) == null) {
          productsGrpc.getCreateMethod = getCreateMethod = 
              io.grpc.MethodDescriptor.<com.alswa.products.ProductOuterClass.Product, com.alswa.products.ProductOuterClass.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "products", "create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.alswa.products.ProductOuterClass.Product.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.alswa.products.ProductOuterClass.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new productsMethodDescriptorSupplier("create"))
                  .build();
          }
        }
     }
     return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.alswa.products.ProductOuterClass.Product,
      com.alswa.products.ProductOuterClass.Product> getEditMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "edit",
      requestType = com.alswa.products.ProductOuterClass.Product.class,
      responseType = com.alswa.products.ProductOuterClass.Product.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.alswa.products.ProductOuterClass.Product,
      com.alswa.products.ProductOuterClass.Product> getEditMethod() {
    io.grpc.MethodDescriptor<com.alswa.products.ProductOuterClass.Product, com.alswa.products.ProductOuterClass.Product> getEditMethod;
    if ((getEditMethod = productsGrpc.getEditMethod) == null) {
      synchronized (productsGrpc.class) {
        if ((getEditMethod = productsGrpc.getEditMethod) == null) {
          productsGrpc.getEditMethod = getEditMethod = 
              io.grpc.MethodDescriptor.<com.alswa.products.ProductOuterClass.Product, com.alswa.products.ProductOuterClass.Product>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "products", "edit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.alswa.products.ProductOuterClass.Product.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.alswa.products.ProductOuterClass.Product.getDefaultInstance()))
                  .setSchemaDescriptor(new productsMethodDescriptorSupplier("edit"))
                  .build();
          }
        }
     }
     return getEditMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.alswa.products.ProductOuterClass.DefaultRequest,
      com.alswa.products.ProductOuterClass.Empty> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "delete",
      requestType = com.alswa.products.ProductOuterClass.DefaultRequest.class,
      responseType = com.alswa.products.ProductOuterClass.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.alswa.products.ProductOuterClass.DefaultRequest,
      com.alswa.products.ProductOuterClass.Empty> getDeleteMethod() {
    io.grpc.MethodDescriptor<com.alswa.products.ProductOuterClass.DefaultRequest, com.alswa.products.ProductOuterClass.Empty> getDeleteMethod;
    if ((getDeleteMethod = productsGrpc.getDeleteMethod) == null) {
      synchronized (productsGrpc.class) {
        if ((getDeleteMethod = productsGrpc.getDeleteMethod) == null) {
          productsGrpc.getDeleteMethod = getDeleteMethod = 
              io.grpc.MethodDescriptor.<com.alswa.products.ProductOuterClass.DefaultRequest, com.alswa.products.ProductOuterClass.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "products", "delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.alswa.products.ProductOuterClass.DefaultRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.alswa.products.ProductOuterClass.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new productsMethodDescriptorSupplier("delete"))
                  .build();
          }
        }
     }
     return getDeleteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static productsStub newStub(io.grpc.Channel channel) {
    return new productsStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static productsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new productsBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static productsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new productsFutureStub(channel);
  }

  /**
   */
  public static abstract class productsImplBase implements io.grpc.BindableService {

    /**
     */
    public void fetch(com.alswa.products.ProductOuterClass.DefaultRequest request,
        io.grpc.stub.StreamObserver<com.alswa.products.ProductOuterClass.Product> responseObserver) {
      asyncUnimplementedUnaryCall(getFetchMethod(), responseObserver);
    }

    /**
     */
    public void create(com.alswa.products.ProductOuterClass.Product request,
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
                com.alswa.products.ProductOuterClass.Product,
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
  public static final class productsStub extends io.grpc.stub.AbstractStub<productsStub> {
    private productsStub(io.grpc.Channel channel) {
      super(channel);
    }

    private productsStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected productsStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new productsStub(channel, callOptions);
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
    public void create(com.alswa.products.ProductOuterClass.Product request,
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
  public static final class productsBlockingStub extends io.grpc.stub.AbstractStub<productsBlockingStub> {
    private productsBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private productsBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected productsBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new productsBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.alswa.products.ProductOuterClass.Product fetch(com.alswa.products.ProductOuterClass.DefaultRequest request) {
      return blockingUnaryCall(
          getChannel(), getFetchMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.alswa.products.ProductOuterClass.Empty create(com.alswa.products.ProductOuterClass.Product request) {
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
  public static final class productsFutureStub extends io.grpc.stub.AbstractStub<productsFutureStub> {
    private productsFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private productsFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected productsFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new productsFutureStub(channel, callOptions);
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
        com.alswa.products.ProductOuterClass.Product request) {
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
    private final productsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(productsImplBase serviceImpl, int methodId) {
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
          serviceImpl.create((com.alswa.products.ProductOuterClass.Product) request,
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

  private static abstract class productsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    productsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.alswa.products.ProductOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("products");
    }
  }

  private static final class productsFileDescriptorSupplier
      extends productsBaseDescriptorSupplier {
    productsFileDescriptorSupplier() {}
  }

  private static final class productsMethodDescriptorSupplier
      extends productsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    productsMethodDescriptorSupplier(String methodName) {
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
      synchronized (productsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new productsFileDescriptorSupplier())
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
