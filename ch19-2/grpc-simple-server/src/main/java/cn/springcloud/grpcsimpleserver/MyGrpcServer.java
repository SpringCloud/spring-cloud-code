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

package cn.springcloud.grpcsimpleserver;

import cn.springcloud.grpcsimpleserver.servcie.HelloService;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import java.io.IOException;


public class MyGrpcServer {
    static public void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort( 8082 )
                .addService( new HelloService() )
                .build();

        System.out.println( "Starting server..." );
        server.start();
        System.out.println( "Server started!" );
        server.awaitTermination();
    }


}
