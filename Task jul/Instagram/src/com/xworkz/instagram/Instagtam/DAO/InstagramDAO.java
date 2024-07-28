package com.xworkz.instagram.Instagtam.DAO;


import com.xworkz.instagram.Instagtam.DTO.InstagramDto;

public class InstagramDAO {

    InstagramDto dto;

    public void createInstagram(InstagramDto dto) {
        if (dto != null) {
            if (dto.username != null &&
                    dto.fullName != null &&
                    dto.followers >= 0 &&
                    dto.following >= 0 &&
                    dto.posts >= 0 &&
                    dto.yearJoined >= 2010) {
                this.dto = dto;
                System.out.println("Instagram profile created successfully.");
            } else {
                System.out.println("Invalid values provided for Instagram profile creation.");
            }
        } else {
            System.out.println("Please provide valid information.");
        }
    }

    public void getInstagram() {
        System.out.println("Instagram Profile Details:");
        System.out.println("Username: " + dto.username);
        System.out.println("Full Name: " + dto.fullName);
        System.out.println("Followers: " + dto.followers);
        System.out.println("Following: " + dto.following);
        System.out.println("Posts: " + dto.posts);
        System.out.println("Year Joined: " + dto.yearJoined);
    }
}
