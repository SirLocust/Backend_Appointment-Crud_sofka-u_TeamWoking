package com.team_two.appointment_crud.appointment_crud.controller;

import com.team_two.appointment_crud.appointment_crud.entity.Appointment;
import com.team_two.appointment_crud.appointment_crud.service.ServiceAppointment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Optional;

@RestController
@RequestMapping("api")
public class AppointmentController {
    @Autowired
    private ServiceAppointment service;

    @GetMapping(value = "/appointment")
    public Iterable<Appointment>getAppointment(){
        return service.ReadAll();
    }
    @GetMapping(value = "/appointment/{id}")
    public Appointment getAppointment(@PathVariable Long id){
        return service.ReadId(id);
    }
    @PostMapping(value ="/appointment")
    public Appointment postAppointment(@RequestBody Appointment appointment){
        appointment.setDate(LocalDateTime.now());
        return service.Save(appointment);
    }
    @DeleteMapping(value = "/appointment/{id}")
    public void deleteAppointment(@PathVariable Long id){
        service.Delete(id);
    }
    @PutMapping(value = "/appointment")
    public Appointment updateAppointment(@RequestBody Appointment appointment){
        return service.Update(appointment);
    }

}
