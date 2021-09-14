package com.team_two.appointment_crud.appointment_crud.controller;

import com.team_two.appointment_crud.appointment_crud.entity.Appointment;
import com.team_two.appointment_crud.appointment_crud.service.ServiceAppointment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("api")
public class AppointmentController {
    @Autowired
    private ServiceAppointment service;

    @GetMapping(value = "/appointment")
    public Iterable<Appointment>getAppointment(){
        return ;
    }
    @GetMapping(value = "/appointment/{id}")
    public Optional<Appointment> getAppointment(@PathVariable Long id){
        return ;
    }
    @PostMapping(value ="/appointment/")
    public Appointment postAppointment(@RequestBody Appointment appointment){
        return ;
    }
    @DeleteMapping(value = "/appointment/{id}")
    public void deleteAppointment(@PathVariable Long id){

    }
    @PutMapping(value = "/appointment/")
    public void updateAppointment(@RequestBody Appointment appointment){

    }

}
