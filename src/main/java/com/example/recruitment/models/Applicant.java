package com.example.recruitment.models;

import javax.persistence.*;

@Entity
@Table(name = "Applicant")
public class Applicant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "FIO")
    private String FIO;
    @Column(name = "Gender")
    private String Gender;
    @Column(name = "Birthdate")
    private String Birthdate;
    @Column(name = "IdRecruiter")
    private int IdRecruiter;

    public Applicant() {
    }

    public Long getId() {
        return this.id;
    }

    public String getFIO() {
        return this.FIO;
    }

    public String getGender() {
        return this.Gender;
    }

    public String getBirthdate() {
        return this.Birthdate;
    }

    public int getIdRecruiter() {
        return this.IdRecruiter;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public void setBirthdate(String Birthdate) {
        this.Birthdate = Birthdate;
    }

    public void setIdRecruiter(int IdRecruiter) {
        this.IdRecruiter = IdRecruiter;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Applicant)) return false;
        final Applicant other = (Applicant) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$FIO = this.getFIO();
        final Object other$FIO = other.getFIO();
        if (this$FIO == null ? other$FIO != null : !this$FIO.equals(other$FIO)) return false;
        final Object this$Gender = this.getGender();
        final Object other$Gender = other.getGender();
        if (this$Gender == null ? other$Gender != null : !this$Gender.equals(other$Gender)) return false;
        final Object this$Birthdate = this.getBirthdate();
        final Object other$Birthdate = other.getBirthdate();
        if (this$Birthdate == null ? other$Birthdate != null : !this$Birthdate.equals(other$Birthdate)) return false;
        if (this.getIdRecruiter() != other.getIdRecruiter()) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Applicant;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $FIO = this.getFIO();
        result = result * PRIME + ($FIO == null ? 43 : $FIO.hashCode());
        final Object $Gender = this.getGender();
        result = result * PRIME + ($Gender == null ? 43 : $Gender.hashCode());
        final Object $Birthdate = this.getBirthdate();
        result = result * PRIME + ($Birthdate == null ? 43 : $Birthdate.hashCode());
        result = result * PRIME + this.getIdRecruiter();
        return result;
    }

    public String toString() {
        return "Applicant(id=" + this.getId() + ", FIO=" + this.getFIO() + ", Gender=" + this.getGender() + ", Birthdate=" + this.getBirthdate() + ", IdRecruiter=" + this.getIdRecruiter() + ")";
    }
}