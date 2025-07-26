package com.assessment.summative.data.model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "server")

public class Server {

    //    Server_ID INT PRIMARY KEY AUTO_INCREMENT,
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "server_id")
    private Integer serverId;

//    First_Name VARCHAR(25) NOT NULL,
    @Column(name = "first_name", nullable = false)
    private String firstName;

//    Last_Name VARCHAR(25) NOT NULL,
    @Column(name = "last_name", nullable = false)
    private String lastName;

//    Hire_Date DATE NOT NULL,
    @Column(name = "hire_date", nullable = false)
    private LocalDateTime hireDate;

//    Term_Date DATE NULL
    @Column(name = "term_date")
    private LocalDateTime termDate;

    public Integer getServerId() {
        return serverId;
    }

    public void setServerId(Integer serverId) {
        this.serverId = serverId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDateTime getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDateTime hireDate) {
        this.hireDate = hireDate;
    }

    public LocalDateTime getTermDate() {
        return termDate;
    }

    public void setTermDate(LocalDateTime termDate) {
        this.termDate = termDate;
    }
}
