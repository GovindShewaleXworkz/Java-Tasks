package com.xworkz.CrunchtRoll.DAO;

import com.xworkz.CrunchtRoll.DTO.CrunchtRollDTO;

public class CrunchtRollDAO {
    CrunchtRollDTO dto;

    public void createAnime(CrunchtRollDTO dto) {
        if (dto != null) {
            // Validate fields within the DTO
            if (dto.anime != null &&
                    dto.porductionHouse != null &&
                    dto.genre != null &&
                    dto.epNos > 0 &&
                    dto.rating >= 0 &&
                    dto.yearOfRlease >= 1900) {
                this.dto = dto;
                System.out.println("Anime created successfully.");
            } else {
                System.out.println("Invalid values provided for anime creation.");
            }
        } else {
            System.out.println("Please provide valid information.");
        }
    }


    public void getAnime() {
        System.out.println("The available anime are");
        System.out.println("Anime Name:" + dto.anime);
        System.out.println("Production House:" + dto.porductionHouse);
        System.out.println("Genre:" + dto.genre);
        System.out.println("No. of episodes:" + dto.epNos);
        System.out.println("Rating:" + dto.rating);
        System.out.println("Year of release:" + dto.yearOfRlease);


    }
}
