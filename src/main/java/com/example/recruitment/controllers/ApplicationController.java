package com.example.recruitment.controllers;

import com.example.recruitment.models.Application;
import com.example.recruitment.services.ApplicationsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class ApplicationController {
    private final ApplicationsService applicationsService;

    @GetMapping("/application")
    public String applications(@RequestParam(name = "title", required = false) String title, Model model) {
        model.addAttribute("applications", applicationsService.listApplications(title));
        return "applications";
    }

    @GetMapping("/application/{id}")
    public String applicationInfo(@PathVariable Long id, Model model) {
        model.addAttribute("application", applicationsService.getApplicationById(id));
        return "application-info";
    }

    @PostMapping("/application/create")
    public String createApplication(Application application) {
        applicationsService.saveApplication(application);
        return "redirect:/";
    }

    @PostMapping("/application/delete/{id}")
    public String deleteApplication(@PathVariable Long id) {
        applicationsService.deleteApplication(id);
        return "redirect:/";
    }

}