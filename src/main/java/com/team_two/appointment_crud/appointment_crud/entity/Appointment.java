package com.team_two.appointment_crud.appointment_crud.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "appointment")
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime date;
    private String nameDoctor;
    private String namePatient;
    private String motiveConsult;
    private String building;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getNameDoctor() {
        return nameDoctor;
    }

    public void setNameDoctor(String nameDoctor) {
        this.nameDoctor = nameDoctor;
    }

    public String getNamePatient() {
        return namePatient;
    }

    public void setNamePatient(String namePatient) {
        this.namePatient = namePatient;
    }

    public String getMotiveConsult() {
        return motiveConsult;
    }

    public void setMotiveConsult(String motiveConsult) {
        this.motiveConsult = motiveConsult;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }
}
