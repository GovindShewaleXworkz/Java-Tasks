package com.xworkz.Chelsea.DAO;

import com.xworkz.Chelsea.DTO.ChelseaDTO;

public class ChelseaDAO {
    ChelseaDTO dto;

    public void createChelsea(ChelseaDTO dto) {
        if (dto != null) {
            if (dto.playerName != null &&
                    dto.position != null &&
                    dto.jerseyNumber > 0 &&
                    dto.goals >= 0 &&
                    dto.assists >= 0 &&
                    dto.yearJoined >= 2000) {
                this.dto = dto;
                System.out.println("Chelsea player added successfully.");
            } else {
                System.out.println("Invalid values provided for Chelsea player creation.");
            }
        } else {
            System.out.println("Please provide valid information.");
        }
    }

    public void getChelsea() {
        System.out.println("Chelsea Player Details:");
        System.out.println("Player Name: " + dto.playerName);
        System.out.println("Position: " + dto.position);
        System.out.println("Jersey Number: " + dto.jerseyNumber);
        System.out.println("Goals: " + dto.goals);
        System.out.println("Assists: " + dto.assists);
        System.out.println("Year Joined: " + dto.yearJoined);
    }
}
