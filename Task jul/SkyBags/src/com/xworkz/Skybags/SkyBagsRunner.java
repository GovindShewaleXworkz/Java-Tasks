package com.xworkz.Skybags;

import com.xworkz.Skybags.DAO.SkyBagsDAO;
import com.xworkz.Skybags.DTO.SkyBagsDTO;

public class SkyBagsRunner {
    public static void main(String[] args) {

        SkyBagsDTO dto=new SkyBagsDTO();
        SkyBagsDAO dao= new SkyBagsDAO();

        dto.bagName="Safarii";
        dto.brand="SkyBags";
        dto.capacity=3;
        dto.price=3500;
        dto.color="Green";

        dao.createSkyBags(dto);
        dao.getSkyBags();

    }
}
