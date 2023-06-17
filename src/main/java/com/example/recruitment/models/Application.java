package com.example.recruitment.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "applications")
@Data
public class Application {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "title")
    private String title;
    @Column(name = "name_post")
    private String name_post;
    @Column(name = "number_people")
    private int number_people;
    @Column(name = "requirements", columnDefinition = "text")
    private String requirements;
    @Column(name = "wage")
    private int wage;
    @Column(name = "schedule")
    private String schedule;
    @Column(name = "date_of_completion")
    private String date_of_completion;
    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    @JoinColumn
    private User user;

}