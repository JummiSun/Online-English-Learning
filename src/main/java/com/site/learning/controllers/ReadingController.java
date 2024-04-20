package com.site.learning.controllers;

import com.site.learning.models.Reading;
import com.site.learning.services.ReadingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ReadingController {

    private final ReadingService readingService;

    @Autowired
    public ReadingController(ReadingService readingService){
        this.readingService = readingService;
    }
    @GetMapping("/reading")
    public String getReadings(Model model){
        List<Reading> readings = readingService.getAllReadings();
        model.addAttribute("readings", readings);
        return "reading";
    }
}
