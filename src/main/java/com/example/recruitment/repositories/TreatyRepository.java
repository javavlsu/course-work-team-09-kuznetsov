package com.example.recruitment.repositories;

import com.example.recruitment.models.Treaty;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TreatyRepository extends JpaRepository<Treaty, Long> {
    List<Treaty> findAll();
}
