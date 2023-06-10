package com.example.recruitment.models;

import javax.persistence.*;

@Entity
@Table(name = "Treaty")
public class Treaty {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "name_post")
    private String name_post;
    @Column(name = "FIO")
    private String FIO;
    @Column(name = "StatusTreaty")
    private String StatusTreaty;
    @Column(name = "PersonalData", columnDefinition = "text")
    private String PersonalData;
    @Column(name = "Wage")
    private int Wage;
    @Column(name = "date_of_conclusion")
    private String date_of_conclusion;
    @Column(name = "IdApplicant")
    private int IdApplicant;

    public Treaty() {
    }

    public Long getId() {
        return this.id;
    }

    public String getName_post() {
        return this.name_post;
    }

    public String getFIO() {
        return this.FIO;
    }

    public String getStatusTreaty() {
        return this.StatusTreaty;
    }

    public String getPersonalData() {
        return this.PersonalData;
    }

    public int getWage() {
        return this.Wage;
    }

    public String getDate_of_conclusion() {
        return this.date_of_conclusion;
    }

    public int getIdApplicant() {
        return this.IdApplicant;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName_post(String name_post) {
        this.name_post = name_post;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public void setStatusTreaty(String StatusTreaty) {
        this.StatusTreaty = StatusTreaty;
    }

    public void setPersonalData(String PersonalData) {
        this.PersonalData = PersonalData;
    }

    public void setWage(int Wage) {
        this.Wage = Wage;
    }

    public void setDate_of_conclusion(String date_of_conclusion) {
        this.date_of_conclusion = date_of_conclusion;
    }

    public void setIdApplicant(int IdApplicant) {
        this.IdApplicant = IdApplicant;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Treaty)) return false;
        final Treaty other = (Treaty) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$name_post = this.getName_post();
        final Object other$name_post = other.getName_post();
        if (this$name_post == null ? other$name_post != null : !this$name_post.equals(other$name_post)) return false;
        final Object this$FIO = this.getFIO();
        final Object other$FIO = other.getFIO();
        if (this$FIO == null ? other$FIO != null : !this$FIO.equals(other$FIO)) return false;
        final Object this$StatusTreaty = this.getStatusTreaty();
        final Object other$StatusTreaty = other.getStatusTreaty();
        if (this$StatusTreaty == null ? other$StatusTreaty != null : !this$StatusTreaty.equals(other$StatusTreaty))
            return false;
        final Object this$PersonalData = this.getPersonalData();
        final Object other$PersonalData = other.getPersonalData();
        if (this$PersonalData == null ? other$PersonalData != null : !this$PersonalData.equals(other$PersonalData))
            return false;
        if (this.getWage() != other.getWage()) return false;
        final Object this$date_of_conclusion = this.getDate_of_conclusion();
        final Object other$date_of_conclusion = other.getDate_of_conclusion();
        if (this$date_of_conclusion == null ? other$date_of_conclusion != null : !this$date_of_conclusion.equals(other$date_of_conclusion))
            return false;
        if (this.getIdApplicant() != other.getIdApplicant()) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Treaty;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $name_post = this.getName_post();
        result = result * PRIME + ($name_post == null ? 43 : $name_post.hashCode());
        final Object $FIO = this.getFIO();
        result = result * PRIME + ($FIO == null ? 43 : $FIO.hashCode());
        final Object $StatusTreaty = this.getStatusTreaty();
        result = result * PRIME + ($StatusTreaty == null ? 43 : $StatusTreaty.hashCode());
        final Object $PersonalData = this.getPersonalData();
        result = result * PRIME + ($PersonalData == null ? 43 : $PersonalData.hashCode());
        result = result * PRIME + this.getWage();
        final Object $date_of_conclusion = this.getDate_of_conclusion();
        result = result * PRIME + ($date_of_conclusion == null ? 43 : $date_of_conclusion.hashCode());
        result = result * PRIME + this.getIdApplicant();
        return result;
    }

    public String toString() {
        return "Treaty(id=" + this.getId() + ", name_post=" + this.getName_post() + ", FIO=" + this.getFIO() + ", StatusTreaty=" + this.getStatusTreaty() + ", PersonalData=" + this.getPersonalData() + ", Wage=" + this.getWage() + ", date_of_conclusion=" + this.getDate_of_conclusion() + ", IdApplicant=" + this.getIdApplicant() + ")";
    }
}