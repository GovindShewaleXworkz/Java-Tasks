package com.xworkz.Hitech;

import com.xworkz.Hitech.DAO.HitechDAO;
import com.xworkz.Hitech.DTO.HitechDTO;

public class HitechRunner {

    public static void main(String[] args) {
        HitechDTO dto=new HitechDTO();
        HitechDAO dao=new HitechDAO();

        dto.productName="SmartPhone";
        dto.brand="Hitachi";
        dto.features="Snapdragon 8 gen +, long lasting battery";
        dto.price=1993784;
        dto.yearReleased=2024;

        dao.createHitech(dto);
        dao.getHitech();

    }
}
