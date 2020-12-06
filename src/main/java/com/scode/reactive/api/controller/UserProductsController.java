package com.scode.reactive.api.controller;

import com.scode.reactive.api.dto.UserProductResponse;
import com.scode.reactive.service.UserProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/user-products")
@RequiredArgsConstructor
public class UserProductsController {

    private final UserProductService userProductService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<UserProductResponse> userProducts() {
        return userProductService.userProducts();
    }
}
