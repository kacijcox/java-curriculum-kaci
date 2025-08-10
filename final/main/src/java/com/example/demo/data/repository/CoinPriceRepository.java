package com.example.demo.data.repository;


import com.example.demo.data.model.CoinPrice;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CoinPriceRepository extends JpaRepository<CoinPrice, String> {
}