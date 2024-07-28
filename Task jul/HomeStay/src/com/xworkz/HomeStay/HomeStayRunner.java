package com.xworkz.HomeStay;

import com.xworkz.HomeStay.DAO.HomeStayDAO;
import com.xworkz.HomeStay.DTO.HomeStayDTO;

public class HomeStayRunner {
    public static void main(String[] args) {
        HomeStayDTO dto =new HomeStayDTO();
        HomeStayDAO dao=new HomeStayDAO();

        dto.name="Welcome HimeStay";
        dto.location="Bijapur";
        dto.availability=10;
        dto.pricePerNight=1000;
        dto.rating=9;

        dao.createHomestay(dto);
        dao.getHomestay();
    }
}
