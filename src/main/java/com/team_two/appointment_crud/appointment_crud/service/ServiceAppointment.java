package com.team_two.appointment_crud.appointment_crud.service;
import com.team_two.appointment_crud.appointment_crud.entity.Appointment;

import java.util.List;

public interface ServiceAppointment {
    public List<Appointment> ReadAll();
    public Appointment ReadId(Long id);
    public Appointment Save(Appointment appointment);
    public void Delete(Long id);
    public Appointment Update(Appointment appointment);
}