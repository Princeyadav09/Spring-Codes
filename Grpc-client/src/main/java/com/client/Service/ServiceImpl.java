package com.client.Service;


import com.generatedclass.User;
import com.generatedclass.UserServiceGrpc;
import com.google.protobuf.Descriptors;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class ServiceImpl {

    @GrpcClient("grpc-devproblems-service")
    UserServiceGrpc.UserServiceBlockingStub synchronousClient;

    public Map<Descriptors.FieldDescriptor, Object> getUser() {
        User userRequest = User.newBuilder().build();
        User userResponse = synchronousClient.getUser(userRequest);
        return userResponse.getAllFields();
    }
}
