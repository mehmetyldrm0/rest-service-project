package com.javaproject.restservice.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "cross_table")
@Data
public class Cross extends BaseEntity{

    @Column(name = "cross_rate")
    private double crossRate;
}