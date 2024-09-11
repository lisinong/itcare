package com.alexli.cstraining.controller;

import com.alexli.cstraining.model.Hosp;
import com.alexli.cstraining.service.HomePageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/homepage")
@CrossOrigin(origins = "*")
public class HomePageController {
    @Autowired
    private HomePageService homePageService;


    @GetMapping(value = "/allHosp")
    public List<Hosp> findAll() {
        return homePageService.findAll();
    }
}
