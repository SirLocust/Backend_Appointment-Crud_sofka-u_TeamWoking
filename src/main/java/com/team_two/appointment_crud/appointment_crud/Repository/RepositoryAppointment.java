package com.team_two.appointment_crud.appointment_crud.Repository;

import com.team_two.appointment_crud.appointment_crud.entity.Appointment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryAppointment extends CrudRepository<Appointment,Long> {
}
