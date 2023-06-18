package com.example.recruitment.controllers;

import com.example.recruitment.models.Application;
import com.example.recruitment.repositories.ApplicationRepository;
import com.example.recruitment.services.ApplicationsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@Controller
@RequiredArgsConstructor
public class ApplicationController {
    private final ApplicationsService applicationsService;
    private final ApplicationRepository applicationRepository;

    @GetMapping("/application")
    public String applications(@RequestParam(name = "title", required = false) String title, Principal principal, Model model) {
        model.addAttribute("applications", applicationsService.listApplications(title));
        model.addAttribute("user", applicationsService.getUserByPrincipal(principal));
        return "applications";
    }

    @GetMapping("/application/{id}")
    public String applicationInfo(@PathVariable Long id, Model model, Principal principal) {
        Application application= applicationsService.getApplicationById(id);
        model.addAttribute("user", applicationsService.getUserByPrincipal(principal));
        model.addAttribute("application", applicationsService.getApplicationById(id));
        return "application-info";
    }

    @PostMapping("/application/create")
    public String createApplication(Application application) {
        applicationsService.saveApplication(application);
        return "redirect:/";
    }
    @GetMapping("/edit/{id}")
    public String showUpdateForm(@PathVariable("id") Long id, Model model, Principal principal) {
        model.addAttribute("user", applicationsService.getUserByPrincipal(principal));
        Application application= applicationRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid application Id:" + id));

        model.addAttribute("application", application);
        return "editApplication";
    }
    @PostMapping("/update/{id}")
    public String updateApplication(@PathVariable("id") Long id, Application application,
                             BindingResult result, Model model) {
        if (result.hasErrors()) {
            application.setId(id);
            return "editApplication";
        }

        applicationRepository.save(application);
        model.addAttribute("applications", applicationRepository.findAll());
        return "redirect:/application";
    }
   // @PostMapping("/application/{id}")
   // public String deleteApplication(@PathVariable Long id) {
   //     applicationsService.deleteApplication(id);
   //     return "Deleted Successfully";
   // }
    @GetMapping("/application/delete/{id}")
    public String deleteApplication(@PathVariable("id") Long id, Model model) {
        Application application= applicationRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid application Id:" + id));
        applicationRepository.delete(application);
        return "redirect:/application";
    }

}
