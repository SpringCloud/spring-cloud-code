package cn.springcloud.cloudgrpcserver;


import cn.springcloud.grpc.lib.HelloReply;
import cn.springcloud.grpc.lib.HelloRequest;
import cn.springcloud.grpc.lib.SimpleGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.springboot.autoconfigure.grpc.server.GrpcService;


/**
 * emil:miles02@613.com
 * Created by forezp on 2018/8/11.
 */

@GrpcService(SimpleGrpc.class)
public class GrpcServerService extends SimpleGrpc.SimpleImplBase {

    @Override
    public void sayHello(HelloRequest req, StreamObserver<HelloReply> responseObserver) {
        HelloReply reply = HelloReply.newBuilder().setMessage("Hello =============> " + req.getName()).build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }
}
