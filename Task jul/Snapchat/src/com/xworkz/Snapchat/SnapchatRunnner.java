package com.xworkz.Snapchat;

import com.xworkz.Snapchat.DAO.SnapchatDAO;
import com.xworkz.Snapchat.DTO.SnapchatDTO;

public class SnapchatRunnner {
    public static void main(String[] args) {
        SnapchatDTO dto=new SnapchatDTO();
        SnapchatDAO dao=new SnapchatDAO();

        dto.displayName="TIger";
        dto.username="tigerman123";
        dto.snapScore=302000;
        dto.streaks=989;
        dto.yearJoined=2020;

        dao.createSnapchat(dto);
        dao.getSnapchat();
    }

}
