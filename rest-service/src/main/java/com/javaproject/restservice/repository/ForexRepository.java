package com.javaproject.restservice.repository;

import com.javaproject.restservice.entity.Forex;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface ForexRepository extends JpaRepository<Forex,Long> {
    List<Forex> findByCreateDateAndCurrencyCode(LocalDate createDate, String currencyCode);

    Optional<Forex> findByCurrencyCode(String currencyCode);

    Optional<Forex> findByCreateDate(LocalDate createDate);
}
