package com.javaproject.restservice.dto;

import com.javaproject.restservice.entity.Cross;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

@Data
public class CrossDTO {
    private LocalDate createDate;
    private String currencyCode;
    private int unit;
    private double crossRate;

    public CrossDTO(Cross cross) {
        this.createDate = cross.getCreateDate();
        this.unit = cross.getUnit();
        this.currencyCode = cross.getCurrencyCode();
        this.crossRate = cross.getCrossRate();
    }
}
