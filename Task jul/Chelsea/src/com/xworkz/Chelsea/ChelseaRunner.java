package com.xworkz.Chelsea;

import com.xworkz.Chelsea.DAO.ChelseaDAO;
import com.xworkz.Chelsea.DTO.ChelseaDTO;

public class ChelseaRunner {
    public static void main(String[] args) {
        ChelseaDAO dao=new ChelseaDAO();
        ChelseaDTO dto=new ChelseaDTO();

        dto.playerName="Reece James";
        dto.position="Right Back";
        dto.jerseyNumber=22;
        dto.goals=102;
        dto.assists=21;
        dto.yearJoined=2021;

        dao.createChelsea(dto);
        dao.getChelsea();
    }
}
