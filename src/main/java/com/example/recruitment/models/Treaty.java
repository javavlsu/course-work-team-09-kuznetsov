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
    @Column(name = "wage")
    private int Wage;
    @Column(name = "date_of_conclusion")
    private String date_of_conclusion;

    @Column(name = "user_id")
    private Long user_id;

    public Treaty() {
    }

    public Treaty(int id, String name_post, String fio, String statusTreaty, int Wage, String date_of_conclusion) {
        this.id = Long.valueOf(id);
        if (stringIsNullOrEmptyOrBlank(name_post)) {
            throw new IllegalArgumentException("Пустое наименование должности");
        }

        this.name_post = name_post;

        if (stringIsNullOrEmptyOrBlank(fio)) {
            throw new IllegalArgumentException("Пустое ФИО");
        }

        this.fio = fio;
        this.Wage = Wage;
        this.date_of_conclusion = date_of_conclusion;
    }


    private boolean stringIsNullOrEmptyOrBlank(String row) {
        return row == null || row.isEmpty() || row.trim().isEmpty();
    }

}