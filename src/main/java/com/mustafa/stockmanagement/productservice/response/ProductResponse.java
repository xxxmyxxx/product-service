package com.mustafa.stockmanagement.productservice.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
@Builder
@Data
@AllArgsConstructor
public class ProductResponse {
    private Long productId;
    private String productName;
    private Integer quantity;
    private Double price;
    private Long productCreatedDate;
    private Long productUpdatedDate;

}
