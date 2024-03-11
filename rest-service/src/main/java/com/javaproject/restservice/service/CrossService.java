package com.javaproject.restservice.service;

import com.javaproject.restservice.dto.BanknoteDTO;
import com.javaproject.restservice.dto.CrossDTO;
import com.javaproject.restservice.dto.ForexDTO;
import com.javaproject.restservice.entity.Cross;
import com.javaproject.restservice.repository.CrossRepository;
import com.javaproject.restservice.service.Impl.CrossServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CrossService implements CrossServiceImpl {
    private final CrossRepository crossRepository;
    @Override
    public List<CrossDTO> getAllCrossData() {
        return crossRepository.findAll().stream().map(CrossDTO::new).collect(Collectors.toList());
    }

    @Override
    public List<CrossDTO> getCrossDataByParameters(LocalDate createDate, String currencyCode) {
        if (createDate == null && currencyCode == null) {
            return  getAllCrossData();
        }
        return crossRepository.findByCreateDateAndCurrencyCode(createDate, currencyCode)
                .stream().map(CrossDTO::new).collect(Collectors.toList());
    }

    @Override
    public List<CrossDTO> getCrossDataByCreateDate(LocalDate createDate) {
        if (createDate == null) {
            // Eğer currencyCode null ise tüm  kayıtlarını getir
            return getAllCrossData();
        }

        return crossRepository.findByCreateDate(createDate)
                .stream()
                .map(CrossDTO::new).collect(Collectors.toList());
    }

    @Override
    public List<CrossDTO> getCrossDataByCurrencyCode(String currencyCode) {
        if (currencyCode == null) {
            // Eğer currencyCode null ise tüm Forex kayıtlarını getir
            return getAllCrossData();
        }

        return crossRepository.findByCurrencyCode(currencyCode)
                .stream()
                .map(CrossDTO::new).collect(Collectors.toList());
    }
}
