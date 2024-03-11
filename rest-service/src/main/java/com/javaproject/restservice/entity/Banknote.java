package com.javaproject.restservice.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;


@Entity
@Table(name = "banknote_table")
@Data
public class Banknote extends BaseEntity{

    @Column(name = "banknote_buying")
    private double banknoteBuying;

    @Column(name = "banknote_selling")
    private double banknoteSelling;

}