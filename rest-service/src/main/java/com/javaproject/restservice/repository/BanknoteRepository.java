package com.javaproject.restservice.repository;

import com.javaproject.restservice.entity.Banknote;
import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface BanknoteRepository extends JpaRepository<Banknote,Long> {
    List<Banknote> findByCreateDateAndCurrencyCode(LocalDate createDate, String currencyCode);

    Optional<Banknote> findByCreateDate(LocalDate createDate);

    Optional<Banknote> findByCurrencyCode(String currencyCode);
}
