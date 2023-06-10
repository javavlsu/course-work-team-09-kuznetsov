package com.example.recruitment.models;

import javax.persistence.*;

@Entity
@Table(name = "applications")
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

    public Application() {
    }

    public Long getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public String getName_post() {
        return this.name_post;
    }

    public int getNumber_people() {
        return this.number_people;
    }

    public String getRequirements() {
        return this.requirements;
    }

    public int getWage() {
        return this.wage;
    }

    public String getSchedule() {
        return this.schedule;
    }

    public String getDate_of_completion() {
        return this.date_of_completion;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setName_post(String name_post) {
        this.name_post = name_post;
    }

    public void setNumber_people(int number_people) {
        this.number_people = number_people;
    }

    public void setRequirements(String requirements) {
        this.requirements = requirements;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public void setDate_of_completion(String date_of_completion) {
        this.date_of_completion = date_of_completion;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Application)) return false;
        final Application other = (Application) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$title = this.getTitle();
        final Object other$title = other.getTitle();
        if (this$title == null ? other$title != null : !this$title.equals(other$title)) return false;
        final Object this$name_post = this.getName_post();
        final Object other$name_post = other.getName_post();
        if (this$name_post == null ? other$name_post != null : !this$name_post.equals(other$name_post)) return false;
        if (this.getNumber_people() != other.getNumber_people()) return false;
        final Object this$requirements = this.getRequirements();
        final Object other$requirements = other.getRequirements();
        if (this$requirements == null ? other$requirements != null : !this$requirements.equals(other$requirements))
            return false;
        if (this.getWage() != other.getWage()) return false;
        final Object this$schedule = this.getSchedule();
        final Object other$schedule = other.getSchedule();
        if (this$schedule == null ? other$schedule != null : !this$schedule.equals(other$schedule)) return false;
        final Object this$date_of_completion = this.getDate_of_completion();
        final Object other$date_of_completion = other.getDate_of_completion();
        if (this$date_of_completion == null ? other$date_of_completion != null : !this$date_of_completion.equals(other$date_of_completion))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Application;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $title = this.getTitle();
        result = result * PRIME + ($title == null ? 43 : $title.hashCode());
        final Object $name_post = this.getName_post();
        result = result * PRIME + ($name_post == null ? 43 : $name_post.hashCode());
        result = result * PRIME + this.getNumber_people();
        final Object $requirements = this.getRequirements();
        result = result * PRIME + ($requirements == null ? 43 : $requirements.hashCode());
        result = result * PRIME + this.getWage();
        final Object $schedule = this.getSchedule();
        result = result * PRIME + ($schedule == null ? 43 : $schedule.hashCode());
        final Object $date_of_completion = this.getDate_of_completion();
        result = result * PRIME + ($date_of_completion == null ? 43 : $date_of_completion.hashCode());
        return result;
    }

    public String toString() {
        return "Application(id=" + this.getId() + ", title=" + this.getTitle() + ", name_post=" + this.getName_post() + ", number_people=" + this.getNumber_people() + ", requirements=" + this.getRequirements() + ", wage=" + this.getWage() + ", schedule=" + this.getSchedule() + ", date_of_completion=" + this.getDate_of_completion() + ")";
    }
}