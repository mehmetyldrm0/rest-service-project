package com.javaproject.restservice.dto;

import com.javaproject.restservice.entity.Banknote;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

@Data
public class BanknoteDTO {
    private LocalDate createDate;
    private String currencyCode;
    private int unit;
    private double banknoteBuying;
    private double banknoteSelling;

    public BanknoteDTO(Banknote banknote) {
        this.createDate = banknote.getCreateDate();
        this.currencyCode = banknote.getCurrencyCode();
        this.unit = banknote.getUnit();
        this.banknoteBuying = banknote.getBanknoteBuying();
        this.banknoteSelling = banknote.getBanknoteSelling();
    }
}
