package com.team_two.appointment_crud.appointment_crud.service;
import com.team_two.appointment_crud.appointment_crud.entity.Appointment;
import com.team_two.appointment_crud.appointment_crud.service.ServiceAppointment;
import com.team_two.appointment_crud.appointment_crud.Repository.RepositoryAppointment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceAppointmentImpl implements ServiceAppointment{
    @Autowired
    private RepositoryAppointment repository;
    @Override
    public List<Appointment> ReadAll(){
        return (List<Appointment>) repository.findAll();
    }
    @Override
    public Appointment ReadId(Long id){
        return repository.findById(id).get();
    }
    @Override
    public Appointment Save(Appointment appointment){
        return repository.save(appointment);
    }

    @Override
    public void Delete(Long id){
        repository.deleteById(id);
    }

    @Override
    public Appointment Update(Appointment appointment){
        if (repository.findById(appointment.getId()).isPresent()){
            return repository.save(appointment);
        }
        return repository.findById(appointment.getId()).get();
    }
}