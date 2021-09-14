package com.team_two.appointment_crud.appointment_crud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceAppointment1 implements ServiceAppointmentImpl {
    @Autowired
    private ServiceAppointmentImpl service;
    @Override
    public List<Appointment> ReadAll(){
        return (List<Appointment>) service.findAll();
    }
    @Override
    public Appointment ReadId(Long id){
        return service.findById(id).get();
    }

    @Override
    public Appointment Save(Appointment appointment){
        return service.save(appointment);
    }

    @Override
    public void Delete(Long id){
        service.deleteById(id);
    }

    @Override
    public Appointment Update(Appointment appointment){
        if (service.findById(appointment.getId()).isPresent()){
            return service.save(appointment);
        }
        return service.findById(appointment.getId()).get();
    }
}