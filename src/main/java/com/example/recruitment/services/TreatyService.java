package com.example.recruitment.services;

import com.example.recruitment.models.Treaty;
import com.example.recruitment.repositories.TreatyRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
@Slf4j
@RequiredArgsConstructor
public class TreatyService {
    private final TreatyRepository treatyRepository;

    public List<Treaty> listTreatys() {
        return treatyRepository.findAll();
    }

    public void saveTreaty(Treaty treaty) {
        log.info("Saving new {}", treaty);
        treatyRepository.save(treaty);
    }

    public void deleteTreaty(Long id) {
        treatyRepository.deleteById(id);
    }

    public Treaty getTreatyById(Long id) {
        return treatyRepository.findById(id).orElse(null);
    }
}
