package com.ecommerceproject1.ecommerceprojectbyajavsinghraghav.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDto {
    private Long id;
    private String title;
    private Double price;
    private  String category;
    private  String description;
    private String image;

}
