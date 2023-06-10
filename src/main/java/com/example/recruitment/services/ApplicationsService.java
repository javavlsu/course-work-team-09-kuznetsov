package com.example.recruitment.services;

import com.example.recruitment.models.Application;
import com.example.recruitment.repositories.ApplicationRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class ApplicationsService {
    private final ApplicationRepository applicationRepository;

    public List<Application> listApplications(String title) {
        if (title != null) return applicationRepository.findByTitle(title);
        return applicationRepository.findAll();
    }

    public void saveApplication(Application application) {
        log.info("Saving new {}", application);
        applicationRepository.save(application);
    }

    public void deleteApplication(Long id) {
        applicationRepository.deleteById(id);
    }

    public Application getApplicationById(Long id) {
        return applicationRepository.findById(id).orElse(null);
    }
}
