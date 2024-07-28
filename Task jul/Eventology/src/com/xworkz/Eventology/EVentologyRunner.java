package com.xworkz.Eventology;

import com.xworkz.Eventology.DAO.EventologyDAO;
import com.xworkz.Eventology.DTO.EventologyDTO;

public class EVentologyRunner {
    public static void main(String[] args) {
        EventologyDTO dto=new EventologyDTO();
        EventologyDAO dao=new EventologyDAO();

        dto.eventName="Music Festival";
        dto.organizer="SunBurn";
        dto.date="21/July/2024";
        dto.location="Bijapur";
        dto.attendees=10000;

        dao.createEvent(dto);
        dao.getEvent();

    }
}
