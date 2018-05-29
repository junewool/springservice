package com.junewool.springservice.controller;


import com.junewool.springservice.dao.entity.StatiTest;
import com.junewool.springservice.dao.repository.PagingStatRepository;
import com.junewool.springservice.dao.repository.StatiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/stat", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class StatiController {

    @Autowired
    private StatiRepository repository;

    @Autowired
    private PagingStatRepository pagingStatRepository;

    @RequestMapping(value = "/all")
    public Page<StatiTest> getAll() {
        PageRequest request = PageRequest.of(1,20);
        Page<StatiTest> page = pagingStatRepository.findAll(request);
        return page;
    }


}
