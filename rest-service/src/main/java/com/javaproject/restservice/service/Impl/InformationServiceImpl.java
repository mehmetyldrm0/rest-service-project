package com.javaproject.restservice.service.Impl;

import com.javaproject.restservice.dto.InformationDTO;

import java.time.LocalDate;
import java.util.List;

public interface InformationServiceImpl {
    List<InformationDTO> getAllInformationData();

    List<InformationDTO> getInformationDataByParameters(LocalDate createDate, String currencyCode);

    List<InformationDTO> getInformationDataByCreateDate(LocalDate createDate);

    List<InformationDTO> getInformationDataByCurrencyCode(String currencyCode);
}
