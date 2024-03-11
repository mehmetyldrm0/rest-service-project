package com.javaproject.restservice.dto;

import com.javaproject.restservice.entity.Information;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

@Data
public class InformationDTO {
    private LocalDate createDate;
    private String currencyCode;
    private int unit;
    private double informationRate;

    public InformationDTO(Information information) {
        this.createDate = information.getCreateDate();
        this.currencyCode = information.getCurrencyCode();
        this.unit = information.getUnit();
        this.informationRate = information.getInformationRate();
    }
}
