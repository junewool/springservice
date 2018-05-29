package com.junewool.springservice.dao.repository;

import com.junewool.springservice.dao.entity.StatiTest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaStatRepository extends JpaRepository<StatiTest, Long> {

}
