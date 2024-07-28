package com.xworkz.Myntra;

import com.xworkz.Myntra.Dao.MyntraDAO;
import com.xworkz.Myntra.Dto.MyntraDTO;

public class MyntraRunner {
    public static void main(String[] args) {

        MyntraDTO dto=new MyntraDTO();
        MyntraDAO dao=new MyntraDAO();

        dto.productName="Jordan Air One";
        dto.brand="Nike";
        dto.price=35000;
        dto.discount=1000;
        dto.category="Shoes";

        dao.createMyntra(dto);
        dao.getMyntra();

    }
}
