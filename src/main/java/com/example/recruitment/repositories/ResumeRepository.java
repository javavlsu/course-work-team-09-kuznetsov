package com.example.recruitment.repositories;

import com.example.recruitment.models.Resume;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ResumeRepository extends JpaRepository<Resume, Long> {
    List<Resume> findByTitle(String title);
}
