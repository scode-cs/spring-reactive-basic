package com.scode.reactive.service;

import com.scode.reactive.api.dto.ProductResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.LongStream;

@Service
public class ProductService {

    public List<ProductResponse> products() {
        List<ProductResponse> users = new ArrayList<>();

        LongStream.range(1, 5)
                .forEach(num -> users.add(ProductResponse.builder().id(num).name("Product " + num).build()));

        return users;
    }

}
