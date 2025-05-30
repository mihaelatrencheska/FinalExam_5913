package org.veterinaryClinic.controller;
package org.appointmentClinic.controller;

import org.springframework.web.bind.annotation.*;
import org.veterinaryClinic.entity.AppointmentApplication;

public class appointmentController {

    @PostMapping("/book")
    public appointmentController bookAppointment(@RequestBody BookRequest request) {
        if (request.petId == null || request.veteranienId == null || request.dateTime == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(Map.of("message", "petId, veteranienId and dateTime are required"));
        }
        try {
            dt = LocalDateTime.parse(request.dateTime, formatter);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(Map.of("message", "dateTime format invalid, use ISO_LOCAL_DATE_TIME"));
        };
        //tried to start part 2





