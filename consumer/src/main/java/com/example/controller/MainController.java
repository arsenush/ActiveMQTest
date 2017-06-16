package com.example.controller;

import com.example.repository.StorageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

    private StorageRepository storageRepository;


    @Autowired
    public MainController(StorageRepository storageRepository) {
        this.storageRepository = storageRepository;
    }

    @RequestMapping(value = "/" , method = RequestMethod.GET)
    public String home(Model model) {
        model.addAttribute("data", storageRepository.getData());
        return "index";
    }

}
