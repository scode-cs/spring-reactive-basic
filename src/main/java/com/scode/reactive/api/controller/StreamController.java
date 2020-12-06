package com.scode.reactive.api.controller;

import com.scode.reactive.api.dto.UserResponse;
import com.scode.reactive.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.List;

@RestController
@RequestMapping("/api/stream")
@RequiredArgsConstructor
public class StreamController {

    private final UserService userService;

    @GetMapping(value = "/users", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public Flux<Integer> users() {
        return Flux.just(1,2,3,4).delayElements(Duration.ofSeconds(1)).log();
    }

}
