package com.example.cathayDemo.model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CoinDAO extends JpaRepository<CoinBean, Integer> {

}
