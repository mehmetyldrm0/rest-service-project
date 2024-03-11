package com.javaproject.restservice.service;

import com.javaproject.restservice.dto.ForexDTO;
import com.javaproject.restservice.entity.Forex;
import com.javaproject.restservice.repository.ForexRepository;
import com.javaproject.restservice.service.Impl.ForexServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ForexService implements ForexServiceImpl {
    private final ForexRepository forexRepository;

    @Override
    public List<ForexDTO> getAllForexData() {
        return forexRepository.findAll().stream().map(ForexDTO::new).collect(Collectors.toList());
    }


    @Override
    public List<ForexDTO> getForexDataByParameters(LocalDate createDate, String currencyCode) {
        if (createDate == null && currencyCode == null) {
            return getAllForexData();
        }
        return forexRepository.findByCreateDateAndCurrencyCode(createDate, currencyCode)
                .stream().map(ForexDTO::new).collect(Collectors.toList());
    }

    @Override
    public List<ForexDTO> getForexDataByCreateDate(LocalDate createDate) {
        if (createDate == null) {
            // Eğer currencyCode null ise tüm  kayıtlarını getir
            return getAllForexData();
        }

        return forexRepository.findByCreateDate(createDate)
                .stream()
                .map(ForexDTO::new).collect(Collectors.toList());
    }

    @Override
    public List<ForexDTO> getForexDataByCurrencyCode(String currencyCode) {
        if (currencyCode == null) {
            // Eğer currencyCode null ise tüm  kayıtlarını getir
            return getAllForexData();
        }

        return forexRepository.findByCurrencyCode(currencyCode)
                .stream()
                .map(ForexDTO::new).collect(Collectors.toList());
    }

}
