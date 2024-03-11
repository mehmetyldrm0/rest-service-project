package com.javaproject.restservice.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;


@Entity
@Table(name = "information_table")
@Data
public class Information extends BaseEntity{

    @Column(name = "information_rate")
    private double informationRate;



}
