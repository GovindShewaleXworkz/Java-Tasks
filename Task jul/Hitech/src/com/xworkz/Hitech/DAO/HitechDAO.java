package com.xworkz.Hitech.DAO;

import com.xworkz.Hitech.DTO.HitechDTO;

public class HitechDAO {
    HitechDTO dto;

    public void createHitech(HitechDTO dto) {
        if (dto != null) {
            if (dto.productName != null &&
                    dto.brand != null &&
                    dto.price > 0 &&
                    dto.features != null &&
                    dto.yearReleased >= 2000) {
                this.dto = dto;
                System.out.println("Hitech product added successfully.");
            } else {
                System.out.println("Invalid values provided for Hitech product creation.");
            }
        } else {
            System.out.println("Please provide valid information.");
        }
    }

    public void getHitech() {
        System.out.println("Hitech Product Details:");
        System.out.println("Product Name: " + dto.productName);
        System.out.println("Brand: " + dto.brand);
        System.out.println("Price: " + dto.price);
        System.out.println("Features: " + dto.features);
        System.out.println("Year Released: " + dto.yearReleased);
    }
}
