package com.xworkz.Skybags.DAO;

import com.xworkz.Skybags.DTO.SkyBagsDTO;

public class SkyBagsDAO {

    SkyBagsDTO dto;

    public void createSkyBags(SkyBagsDTO dto) {
        if (dto != null) {
            if (dto.bagName != null &&
                    dto.brand != null &&
                    dto.price > 0 &&
                    dto.capacity > 0 &&
                    dto.color != null) {
                this.dto = dto;
                System.out.println("SkyBag created successfully.");
            } else {
                System.out.println("Invalid values provided for SkyBag creation.");
            }
        } else {
            System.out.println("Please provide valid information.");
        }
    }

    public void getSkyBags() {
        System.out.println("SkyBag Details:");
        System.out.println("Bag Name: " + dto.bagName);
        System.out.println("Brand: " + dto.brand);
        System.out.println("Price: " + dto.price);
        System.out.println("Capacity: " + dto.capacity);
        System.out.println("Color: " + dto.color);
    }
}
