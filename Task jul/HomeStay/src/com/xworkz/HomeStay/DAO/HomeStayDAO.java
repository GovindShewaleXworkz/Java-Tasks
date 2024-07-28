package com.xworkz.HomeStay.DAO;

import com.xworkz.HomeStay.DTO.HomeStayDTO;

public class HomeStayDAO {

    HomeStayDTO dto;

    public void createHomestay(HomeStayDTO dto) {
        if (dto != null) {
            if (dto.name != null &&
                    dto.location != null &&
                    dto.pricePerNight > 0 &&
                    dto.rating >= 0 &&
                    dto.availability > 0) {
                this.dto = dto;
                System.out.println("Homestay created successfully.");
            } else {
                System.out.println("Invalid values provided for homestay creation.");
            }
        } else {
            System.out.println("Please provide valid information.");
        }
    }

    public void getHomestay() {
        System.out.println("Homestay Details:");
        System.out.println("Name: " + dto.name);
        System.out.println("Location: " + dto.location);
        System.out.println("Price Per Night: " + dto.pricePerNight);
        System.out.println("Rating: " + dto.rating);
        System.out.println("Availability: " + dto.availability);
    }
}
