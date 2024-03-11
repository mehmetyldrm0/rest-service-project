package com.javaproject.restservice.controller;

import com.javaproject.restservice.dto.BanknoteDTO;
import com.javaproject.restservice.dto.CrossDTO;
import com.javaproject.restservice.dto.ForexDTO;
import com.javaproject.restservice.dto.InformationDTO;
import com.javaproject.restservice.service.BanknoteService;
import com.javaproject.restservice.service.CrossService;
import com.javaproject.restservice.service.ForexService;
import com.javaproject.restservice.service.InformationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class DataRestController {
    private final ForexService forexService;
    private final BanknoteService banknoteService;
    private final CrossService crossService;
    private final InformationService informationService;


    @GetMapping("/forex")
    public List<ForexDTO> getForexData(@RequestParam(required = false) LocalDate createDate,
                                       @RequestParam(required = false) String currencyCode) {
        return forexService.getForexDataByParameters(createDate, currencyCode);
    }

    @GetMapping("/forex/by-currency")
    public List<ForexDTO> getForexDataByCurrencyCode(@RequestParam(required = false) String currencyCode) {
        return forexService.getForexDataByCurrencyCode(currencyCode);
    }

    @GetMapping("/forex/by-createDate")
    public List<ForexDTO> getForexDataByCreateDate(@RequestParam(required = false) LocalDate createDate) {
        return forexService.getForexDataByCreateDate(createDate);
    }
    @GetMapping("/banknote")
    public List<BanknoteDTO> getBanknoteData(@RequestParam(required = false)
                                                 LocalDate createDate, @RequestParam(required = false) String currencyCode) {
        return banknoteService.getBanknoteDataByParameters( createDate, currencyCode);
    }
    @GetMapping("/banknote/by-currency")
    public List<BanknoteDTO> getBanknoteDataByCurrencyCode(@RequestParam(required = false) String currencyCode) {
        return banknoteService.getBanknoteDataByCurrencyCode(currencyCode);
    }
    @GetMapping("/banknote/by-createDate")
    public List<BanknoteDTO> getBanknoteDataByCreateDate(@RequestParam(required = false) LocalDate createDate) {
        return banknoteService.getBanknoteDataByCreateDate(createDate);
    }

    @GetMapping("/cross")
    public List<CrossDTO> getCrossData(
            @RequestParam(required = false) LocalDate createDate,
            @RequestParam(required = false) String currencyCode) {
        return crossService.getCrossDataByParameters(createDate, currencyCode);
    }
    @GetMapping("/cross/by-createDate")
    public List<CrossDTO> getCrossDataByCreateDate(@RequestParam(required = false) LocalDate createDate) {
        return crossService.getCrossDataByCreateDate(createDate);
    }

    @GetMapping("/cross/by-currency")
    public List<CrossDTO> getCrossDataByCurrencyCode(@RequestParam(required = false) String currencyCode) {
        return crossService.getCrossDataByCurrencyCode(currencyCode);
    }

    @GetMapping("/information")
    public List<InformationDTO> getInformationData(@RequestParam(required = false) LocalDate createDate, @RequestParam(required = false) String currencyCode) {
        return informationService.getInformationDataByParameters(createDate, currencyCode);
    }

    @GetMapping("/information/by-createDate")
    public List<InformationDTO> getInformationDataByCreateDate(@RequestParam(required = false) LocalDate createDate) {
        return informationService.getInformationDataByCreateDate(createDate);
    }

    @GetMapping("/information/by-currency")
    public List<InformationDTO> getInformationDataByCurrencyCode(@RequestParam(required = false) String currencyCode) {
        return informationService.getInformationDataByCurrencyCode(currencyCode);
    }
}
