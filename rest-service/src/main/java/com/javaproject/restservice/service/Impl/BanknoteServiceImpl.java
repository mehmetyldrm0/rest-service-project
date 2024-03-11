package com.javaproject.restservice.service.Impl;
import com.javaproject.restservice.dto.BanknoteDTO;
import java.time.LocalDate;
import java.util.List;

public interface BanknoteServiceImpl {
    List<BanknoteDTO> getAllBanknoteData();

    List<BanknoteDTO> getBanknoteDataByParameters(LocalDate createDate, String currencyCode);

    List<BanknoteDTO> getBanknoteDataByCurrencyCode(String currencyCode);

    List<BanknoteDTO> getBanknoteDataByCreateDate(LocalDate createDate);
}
