package com.example.recruitment.controllers;


import com.example.recruitment.models.Resume;
import com.example.recruitment.services.ResumeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.io.IOException;
import java.security.Principal;

@Controller
@RequiredArgsConstructor
public class ResumeController {
    private final ResumeService resumeService;

    @GetMapping("/resume")
    public String resumes(Principal principal, Model model) {
        model.addAttribute("resumes", resumeService.listResume());
        model.addAttribute("user", resumeService.getUserByPrincipal(principal));
        return "resumes";
    }

    @GetMapping("/resume/{id}")
    public String ResumeInfo(@PathVariable Long id, Model model, Principal principal) {
        Resume resume = resumeService.getResumeById(id);
        model.addAttribute("user", resumeService.getUserByPrincipal(principal));
        model.addAttribute("resume", resume);
        return "resume-info";
    }

    @PostMapping("/resume/create")
    public String createResume(Resume resume) throws IOException {
        resumeService.saveResume(resume);
        return "redirect:/positionProfile";
    }

    @PostMapping("/resume/delete/{id}")
    public String deleteResume(@PathVariable Long id) {
        return "redirect:/";
    }
}