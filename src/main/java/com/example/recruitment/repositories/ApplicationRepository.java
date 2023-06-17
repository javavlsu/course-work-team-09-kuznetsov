package com.example.recruitment.repositories;

import com.example.recruitment.models.Application;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ApplicationRepository extends JpaRepository<Application, Long> {

    @Query("SELECT a FROM Application a ORDER BY title ASC")
    List<Application> findAll();
    @Query("SELECT a FROM Application a WHERE a.title = :title")
    List<Application> findByTitle(@Param("title") String title);
}
