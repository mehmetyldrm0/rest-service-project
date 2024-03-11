package com.javaproject.restservice.service.Impl;


import com.javaproject.restservice.dto.ForexDTO;

import java.time.LocalDate;
import java.util.List;

public interface ForexServiceImpl {
    List<ForexDTO> getAllForexData();

    List<ForexDTO> getForexDataByParameters(LocalDate createDate, String currencyCode);

    List<ForexDTO> getForexDataByCreateDate(LocalDate createDate);

    List<ForexDTO> getForexDataByCurrencyCode(String currencyCode);

}
