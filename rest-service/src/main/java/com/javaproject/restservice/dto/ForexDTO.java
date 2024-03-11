package com.javaproject.restservice.dto;

import com.javaproject.restservice.entity.Forex;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

@Data
public class ForexDTO {
    private LocalDate createDate;
    private String currencyCode;
    private int unit;
    private double forexBuying;
    private double forexSelling;

    public ForexDTO(Forex forex) {
        this.createDate = forex.getCreateDate();
        this.currencyCode = forex.getCurrencyCode();
        this.unit = forex.getUnit();
        this.forexBuying = forex.getForexBuying();
        this.forexSelling = forex.getForexSelling();
    }
}
