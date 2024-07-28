package com.xworkz.Myntra.Dao;

import com.xworkz.Myntra.Dto.MyntraDTO;

public class MyntraDAO {
    MyntraDTO dto;

    public void createMyntra(MyntraDTO dto) {
        if (dto != null) {
            if (dto.productName != null &&
                    dto.brand != null &&
                    dto.price > 0 &&
                    dto.discount >= 0 &&
                    dto.category != null) {
                this.dto = dto;
                System.out.println("Myntra product added successfully.");
            } else {
                System.out.println("Invalid values provided for Myntra product creation.");
            }
        } else {
            System.out.println("Please provide valid information.");
        }
    }

    public void getMyntra() {
        System.out.println("Myntra Product Details:");
        System.out.println("Product Name: " + dto.productName);
        System.out.println("Brand: " + dto.brand);
        System.out.println("Price: " + dto.price);
        System.out.println("Discount: " + dto.discount);
        System.out.println("Category: " + dto.category);
    }
}
