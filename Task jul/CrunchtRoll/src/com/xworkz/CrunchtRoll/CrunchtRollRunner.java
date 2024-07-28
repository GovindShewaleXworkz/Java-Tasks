package com.xworkz.CrunchtRoll;


import com.xworkz.CrunchtRoll.DAO.CrunchtRollDAO;
import com.xworkz.CrunchtRoll.DTO.CrunchtRollDTO;

public class CrunchtRollRunner {
    public static void main(String[] args) {

        CrunchtRollDTO dto=new CrunchtRollDTO();
        CrunchtRollDAO dao= new CrunchtRollDAO();

        dto.anime="Heavenly Delusions";
        dto.genre="Animation, Adventure, Mystery, Sci-Fi";
        dto.porductionHouse="Production I.G";
        dto.epNos=13;
        dto.rating=8.5;
        dto.yearOfRlease=2023;

        dao.createAnime(dto);
        dao.getAnime();

    }

}

