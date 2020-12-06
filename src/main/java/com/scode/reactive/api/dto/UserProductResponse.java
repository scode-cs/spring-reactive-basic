package com.scode.reactive.api.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserProductResponse {

    private User user;

    @Getter
    @Setter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    static class User {
        private Long id;
        private String name;
        private List<Product> products;
    }

    @Getter
    @Setter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    static class Product {
        private Long productId;
        private String productName;
    }
}
