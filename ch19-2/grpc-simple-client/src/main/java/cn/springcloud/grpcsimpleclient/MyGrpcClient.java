/*
 * Copyright 2016 Google, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cn.springcloud.grpcsimpleclient;

import cn.springcloud.grpc.HelloRequest;
import cn.springcloud.grpc.HelloResponse;
import cn.springcloud.grpc.HelloServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

/**
 * Created by rayt on 5/16/16.
 */
public class MyGrpcClient {

  public static void main(String[] args) throws InterruptedException {

    ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8082)
        .usePlaintext()
        .build();

    HelloServiceGrpc.HelloServiceBlockingStub stub =
            HelloServiceGrpc.newBlockingStub(channel);

    HelloResponse helloResponse = stub.hello(
        HelloRequest.newBuilder()
            .setName("forezp")
            .setAge(17)
            .addHobbies("football").putTags( "how?","wonderful" )
            .build());

    System.out.println(helloResponse);


    channel.shutdown();
  }
}
