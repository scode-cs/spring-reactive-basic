package com.scode.reactive.service;

import com.scode.reactive.api.dto.ProductResponse;
import com.scode.reactive.api.dto.UserProductResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class UserProductService {

    private final WebClient webClient;

    private Map<Integer, List<Integer>> userProducts = new LinkedHashMap<>();

    public List<UserProductResponse> userProducts() {
        polulate();

//        webClient.perform(get("http://example.com/accounts/1").accept(APPLICATION_JSON))
//                .extract(body(Account.class));


        return null;
    }

    private void polulate() {
        userProducts.put(1, Arrays.asList(1, 2));
        userProducts.put(2, Arrays.asList(2, 3, 4));
        userProducts.put(3, Arrays.asList(1, 3));
        userProducts.put(4, Arrays.asList(5));
        userProducts.put(5, Arrays.asList(2, 5));
        userProducts.put(6, Arrays.asList(1, 2));
        userProducts.put(7, Arrays.asList(1, 2, 5));
        userProducts.put(8, Arrays.asList(3, 4));
        userProducts.put(9, Arrays.asList(2, 4));
        userProducts.put(10, Arrays.asList(4, 5));
    }
}
