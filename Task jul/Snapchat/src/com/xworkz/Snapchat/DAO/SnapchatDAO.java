package com.xworkz.Snapchat.DAO;

import com.xworkz.Snapchat.DTO.SnapchatDTO;

public class SnapchatDAO {
    SnapchatDTO dto;

    public void createSnapchat(SnapchatDTO dto) {
        if (dto != null) {
            if (dto.username != null &&
                    dto.displayName != null &&
                    dto.snapScore > 0 &&
                    dto.streaks >= 0 &&
                    dto.yearJoined >= 2000) {
                this.dto = dto;
                System.out.println("Snapchat profile created successfully.");
            } else {
                System.out.println("Invalid values provided for Snapchat profile creation.");
            }
        } else {
            System.out.println("Please provide valid information.");
        }
    }

    public void getSnapchat() {
        System.out.println("Snapchat Profile Details:");
        System.out.println("Username: " + dto.username);
        System.out.println("Display Name: " + dto.displayName);
        System.out.println("Snap Score: " + dto.snapScore);
        System.out.println("Streaks: " + dto.streaks);
        System.out.println("Year Joined: " + dto.yearJoined);
    }
}
