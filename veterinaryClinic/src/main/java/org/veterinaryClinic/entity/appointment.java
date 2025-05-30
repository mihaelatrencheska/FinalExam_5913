package org.veterinaryClinic.entity;

import jakarta.persistence.*;

@Entity
public class appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int appointmentDateTime;

    private String reason;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "pet")
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "veterinarian")


    public appointment(Long id, int appointmentDateTime, String reason) {
        this.id = id;
        this.appointmentDateTime = appointmentDateTime;
        this.reason = reason;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAppointmentDateTime() {
        return appointmentDateTime;
    }

    public void setAppointmentDateTime(int appointmentDateTime) {
        this.appointmentDateTime = appointmentDateTime;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
