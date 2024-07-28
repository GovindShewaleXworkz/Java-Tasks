package com.xworkz.Eventology.DAO;


import com.xworkz.Eventology.DTO.EventologyDTO;


public class EventologyDAO {
    EventologyDTO dto;

    public void createEvent(EventologyDTO dto) {
        if (dto != null) {
            if (dto.eventName != null &&
                    dto.organizer != null &&
                    dto.date != null &&
                    dto.location != null &&
                    dto.attendees >= 0) {
                this.dto = dto;
                System.out.println("Event created successfully.");
            } else {
                System.out.println("Invalid values provided for event creation.");
            }
        } else {
            System.out.println("Please provide valid information.");
        }
    }

    public void getEvent() {
        System.out.println("Event Details:");
        System.out.println("Event Name: " + dto.eventName);
        System.out.println("Organizer: " + dto.organizer);
        System.out.println("Date: " + dto.date);
        System.out.println("Location: " + dto.location);
        System.out.println("Attendees: " + dto.attendees);
    }
}
