package com.example.recruitment.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "News")
@Data
public class New {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "title")
    private String title;
    @Column(name = "text")
    private String text;
    @Column(name = "name_author")
    private String name_author;
    @Column(name = "rating")
    private int rating;
}
