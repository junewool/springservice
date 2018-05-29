package com.junewool.springservice.dao.repository;

import com.junewool.springservice.dao.entity.StatiTest;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PagingStatRepository extends PagingAndSortingRepository<StatiTest, Long> {


}
