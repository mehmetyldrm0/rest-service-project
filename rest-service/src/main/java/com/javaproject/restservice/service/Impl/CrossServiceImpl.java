package com.javaproject.restservice.service.Impl;

import com.javaproject.restservice.dto.CrossDTO;

import java.time.LocalDate;
import java.util.List;

public interface CrossServiceImpl {
    List<CrossDTO> getAllCrossData();

    List<CrossDTO> getCrossDataByParameters(LocalDate createDate, String currencyCode);

    List<CrossDTO> getCrossDataByCreateDate(LocalDate createDate);

    List<CrossDTO> getCrossDataByCurrencyCode(String currencyCode);
}
