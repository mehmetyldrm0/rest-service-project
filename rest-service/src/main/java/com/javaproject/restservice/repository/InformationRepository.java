package com.javaproject.restservice.repository;

import com.javaproject.restservice.entity.Information;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface InformationRepository extends JpaRepository<Information,Long> {
    List<Information> findByCreateDateAndCurrencyCode(LocalDate createDate, String currencyCode);

    Optional<Information> findByCurrencyCode(String currencyCode);

    Optional<Information> findByCreateDate(LocalDate createDate);
}
