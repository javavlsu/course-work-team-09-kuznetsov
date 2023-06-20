package com.example.recruitment.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Treaty")
@Data
public class Treaty {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "name_post")
    private String name_post;
    @Column(name = "Fio")
    private String fio;
    @Column(name = "StatusTreaty")
    private String StatusTreaty;
    @Column(name = "personalData", columnDefinition = "text")
    private String PersonalData;
    @Column(name = "wage")
    private int Wage;
    @Column(name = "date_of_conclusion")
    private String date_of_conclusion;

    public Treaty() {
    }

}