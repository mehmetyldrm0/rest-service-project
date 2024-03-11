package com.javaproject.restservice.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "forex_table")
@Data
public class Forex extends BaseEntity{

    @Column(name = "forex_buying")
    private double forexBuying;

    @Column(name = "forex_selling")
    private double forexSelling;


}
