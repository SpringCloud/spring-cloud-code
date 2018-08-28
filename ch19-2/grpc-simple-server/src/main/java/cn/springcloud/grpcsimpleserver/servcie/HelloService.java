package cn.springcloud.grpcsimpleserver.servcie;

import cn.springcloud.grpc.HelloResponse;
import cn.springcloud.grpc.HelloServiceGrpc;



/**
 * Email miles02@163.com
 *
 * @author fangzhipeng
 * create 2018-06-11
 **/
public class HelloService extends HelloServiceGrpc.HelloServiceImplBase {

    @Override
    public void hello(cn.springcloud.grpc.HelloRequest request,
                      io.grpc.stub.StreamObserver<cn.springcloud.grpc.HelloResponse> responseObserver) {
        System.out.println( request );

        String greeting = "Hi " + request.getName() + " you are " + request.getAge() + " years old" +
                " your hoby is " + (request.getHobbiesList()) + " your tags " + request.getTagsMap();

        HelloResponse response = HelloResponse.newBuilder().setGreeting( greeting ).build();
        responseObserver.onNext( response );
        responseObserver.onCompleted();
    }
}
