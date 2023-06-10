package com.example.recruitment.models;

import javax.persistence.*;

@Entity
@Table(name = "Resume")
public class Resume {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "Education")
    private String Education;
    @Column(name = "Experience", columnDefinition = "text")
    private String Experience;
    @Column(name = "Skills", columnDefinition = "text")
    private String Skills;
    @Column(name = "ExpectedSalary")
    private int ExpectedSalary;
    @Column(name = "IdApplicant")
    private int IdApplicant;

    public Resume() {
    }

    public Long getId() {
        return this.id;
    }

    public String getEducation() {
        return this.Education;
    }

    public String getExperience() {
        return this.Experience;
    }

    public String getSkills() {
        return this.Skills;
    }

    public int getExpectedSalary() {
        return this.ExpectedSalary;
    }

    public int getIdApplicant() {
        return this.IdApplicant;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setEducation(String Education) {
        this.Education = Education;
    }

    public void setExperience(String Experience) {
        this.Experience = Experience;
    }

    public void setSkills(String Skills) {
        this.Skills = Skills;
    }

    public void setExpectedSalary(int ExpectedSalary) {
        this.ExpectedSalary = ExpectedSalary;
    }

    public void setIdApplicant(int IdApplicant) {
        this.IdApplicant = IdApplicant;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Resume)) return false;
        final Resume other = (Resume) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$Education = this.getEducation();
        final Object other$Education = other.getEducation();
        if (this$Education == null ? other$Education != null : !this$Education.equals(other$Education)) return false;
        final Object this$Experience = this.getExperience();
        final Object other$Experience = other.getExperience();
        if (this$Experience == null ? other$Experience != null : !this$Experience.equals(other$Experience))
            return false;
        final Object this$Skills = this.getSkills();
        final Object other$Skills = other.getSkills();
        if (this$Skills == null ? other$Skills != null : !this$Skills.equals(other$Skills)) return false;
        if (this.getExpectedSalary() != other.getExpectedSalary()) return false;
        if (this.getIdApplicant() != other.getIdApplicant()) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Resume;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $Education = this.getEducation();
        result = result * PRIME + ($Education == null ? 43 : $Education.hashCode());
        final Object $Experience = this.getExperience();
        result = result * PRIME + ($Experience == null ? 43 : $Experience.hashCode());
        final Object $Skills = this.getSkills();
        result = result * PRIME + ($Skills == null ? 43 : $Skills.hashCode());
        result = result * PRIME + this.getExpectedSalary();
        result = result * PRIME + this.getIdApplicant();
        return result;
    }

    public String toString() {
        return "Resume(id=" + this.getId() + ", Education=" + this.getEducation() + ", Experience=" + this.getExperience() + ", Skills=" + this.getSkills() + ", ExpectedSalary=" + this.getExpectedSalary() + ", IdApplicant=" + this.getIdApplicant() + ")";
    }
}
