package com.emw.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registerEvent")
public class EventController {

    @GetMapping
    public String form() {
        return "event/form";
    }
}
