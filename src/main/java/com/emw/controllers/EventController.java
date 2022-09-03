package com.emw.controllers;

import com.emw.models.EventModel;
import com.emw.repositories.EventRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@AllArgsConstructor
@Controller
@RequestMapping("/event")
public class EventController {

    private EventRepository eventRepository;

    @GetMapping
    public String form() {
        return "event/form";
    }

    @GetMapping("/list")
    public ModelAndView list() {
        ModelAndView modelAndView = new ModelAndView("index");
        Iterable<EventModel> events = eventRepository.findAll();
        modelAndView.addObject("events", events);
        return modelAndView;
    }

    @PostMapping
    public String form(EventModel eventModel) {
        eventRepository.save(eventModel);
        return "redirect:/event/";
    }
}
