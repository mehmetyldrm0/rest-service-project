package com.javaproject.restservice.repository;

import com.javaproject.restservice.entity.Cross;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface CrossRepository extends JpaRepository<Cross,Long> {
    List<Cross> findByCreateDateAndCurrencyCode(LocalDate createDate, String currencyCode);

    Optional<Cross> findByCurrencyCode(String currencyCode);

    Optional<Cross> findByCreateDate(LocalDate createDate);
}
