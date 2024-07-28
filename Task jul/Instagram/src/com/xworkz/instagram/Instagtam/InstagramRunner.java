package com.xworkz.instagram.Instagtam;

import com.xworkz.instagram.Instagtam.DAO.InstagramDAO;
import com.xworkz.instagram.Instagtam.DTO.InstagramDto;

public class InstagramRunner {

    public static void main(String[] args) {

        InstagramDto dto=new InstagramDto();
        InstagramDAO dao=new InstagramDAO();

        dto.username="fabriziorom";
        dto.fullName="Fabrizio Romano";
        dto.followers=30500000;
        dto.following=3684;
        dto.posts=5380;
        dto.yearJoined=2016;

        dao.createInstagram(dto);
        dao.getInstagram();
    }
}
