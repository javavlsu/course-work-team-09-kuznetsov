package com.example.recruitment.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class TreatyController {
   /* private final TreatyService treatyService;

    @GetMapping("/treaty")
    public String Treatys(Model model) {
        model.addAttribute("treatys", treatyService.listTreatys());
        return "treatys";
    }
    @GetMapping("/treaty/{id}")
    public String TreatyInfo(@PathVariable Long id, Model model) {
        model.addAttribute("treaty", treatyService.getTreatyById(id));
        return "treaty-info";
    }

    @PostMapping("/treaty/create")
    public String createTreaty(Treaty treaty) {
        treatyService.saveTreaty(treaty);
        return "redirect:/";
    }

    @PostMapping("/treaty/delete/{id}")
    public String deleteTreaty(@PathVariable Long id) {
        treatyService.deleteTreaty(id);
        return "redirect:/";
    } */
}
