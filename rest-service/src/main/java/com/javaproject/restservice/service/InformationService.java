package com.javaproject.restservice.service;

import com.javaproject.restservice.dto.CrossDTO;
import com.javaproject.restservice.dto.InformationDTO;
import com.javaproject.restservice.repository.InformationRepository;
import com.javaproject.restservice.service.Impl.InformationServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class InformationService implements InformationServiceImpl {
    private final InformationRepository informationRepository;

    @Override
    public List<InformationDTO> getAllInformationData() {
        return informationRepository.findAll().stream().map(InformationDTO::new).collect(Collectors.toList());
    }

    @Override
    public List<InformationDTO> getInformationDataByParameters(LocalDate createDate, String currencyCode) {
        if (createDate == null && currencyCode == null) {
            return getAllInformationData();
        }
        return informationRepository.findByCreateDateAndCurrencyCode(createDate, currencyCode)
                .stream().map(InformationDTO::new).collect(Collectors.toList());
    }

    @Override
    public List<InformationDTO> getInformationDataByCreateDate(LocalDate createDate) {
        if (createDate == null) {
            // Eğer currencyCode null ise tüm  kayıtlarını getir
            return getAllInformationData();
        }

        return informationRepository.findByCreateDate(createDate)
                .stream()
                .map(InformationDTO::new).collect(Collectors.toList());
    }

    @Override
    public List<InformationDTO> getInformationDataByCurrencyCode(String currencyCode) {
        if (currencyCode == null) {
            // Eğer currencyCode null ise tüm Forex kayıtlarını getir
            return getAllInformationData();
        }

        return informationRepository.findByCurrencyCode(currencyCode)
                .stream()
                .map(InformationDTO::new).collect(Collectors.toList());
    }
}
