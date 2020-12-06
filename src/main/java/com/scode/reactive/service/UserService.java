package com.scode.reactive.service;

import com.scode.reactive.api.dto.UserResponse;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.LongStream;

@Service
public class UserService {
    public List<UserResponse> users() {
        List<UserResponse> users = new ArrayList<>();
        Flux<UserResponse> userFlux;

        LongStream.range(1, 10)
                .forEach(num -> users.add(UserResponse.builder().id(num).name("User " + num).build()));

        return users;
    }
}
