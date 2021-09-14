package com.team_two.appointment_crud.appointment_crud.Repository;

import com.team_two.appointment_crud.appointment_crud.entity.Appointment;
import org.springframework.data.repository.CrudRepository;

public interface InterfaceRepositoryAppointment extends CrudRepository<Appointment,Long> {
}
