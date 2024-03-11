package com.javaproject.restservice.service;

import com.javaproject.restservice.dto.BanknoteDTO;
import com.javaproject.restservice.dto.ForexDTO;
import com.javaproject.restservice.repository.BanknoteRepository;
import com.javaproject.restservice.service.Impl.BanknoteServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BanknoteService implements BanknoteServiceImpl {
    private final BanknoteRepository banknoteRepository;

    @Override
    public List<BanknoteDTO> getAllBanknoteData() {
        return banknoteRepository.findAll().stream().map(BanknoteDTO::new).collect(Collectors.toList());
    }

    @Override
    public List<BanknoteDTO> getBanknoteDataByParameters(LocalDate createDate, String currencyCode) {
        if (createDate == null && currencyCode == null) {
            return getAllBanknoteData();
        }

        return banknoteRepository.findByCreateDateAndCurrencyCode(createDate, currencyCode)
                .stream().map(BanknoteDTO::new).collect(Collectors.toList());
    }

    @Override
    public List<BanknoteDTO> getBanknoteDataByCurrencyCode(String currencyCode) {
        if (currencyCode == null) {
            // Eğer currencyCode null ise tüm  kayıtlarını getir
            return getAllBanknoteData();
        }

        return banknoteRepository.findByCurrencyCode(currencyCode)
                .stream()
                .map(BanknoteDTO::new).collect(Collectors.toList());
    }

    @Override
    public List<BanknoteDTO> getBanknoteDataByCreateDate(LocalDate createDate) {
        if (createDate == null) {
            // Eğer currencyCode null ise tüm  kayıtlarını getir
            return getAllBanknoteData();
        }

        return banknoteRepository.findByCreateDate(createDate)
                .stream()
                .map(BanknoteDTO::new).collect(Collectors.toList());
    }

}
