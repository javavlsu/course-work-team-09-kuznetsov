package com.example.recruitment.models;

import javax.persistence.*;

@Entity
@Table(name = "Contest")
public class Contest {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "NumberResume")
    private int NumberResume;
    @Column(name = "NumberVacancies")
    private int NumberVacancies;
    @Column(name = "IdProfile")
    private int IdProfile;
    @Column(name = "IdResume")
    private int IdResume;
    @Column(name = "GradeResume")
    private int GradeResume;
    @Column(name = "Result", columnDefinition = "text")
    private String Result;

    public Contest() {
    }

    public Long getId() {
        return this.id;
    }

    public int getNumberResume() {
        return this.NumberResume;
    }

    public int getNumberVacancies() {
        return this.NumberVacancies;
    }

    public int getIdProfile() {
        return this.IdProfile;
    }

    public int getIdResume() {
        return this.IdResume;
    }

    public int getGradeResume() {
        return this.GradeResume;
    }

    public String getResult() {
        return this.Result;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNumberResume(int NumberResume) {
        this.NumberResume = NumberResume;
    }

    public void setNumberVacancies(int NumberVacancies) {
        this.NumberVacancies = NumberVacancies;
    }

    public void setIdProfile(int IdProfile) {
        this.IdProfile = IdProfile;
    }

    public void setIdResume(int IdResume) {
        this.IdResume = IdResume;
    }

    public void setGradeResume(int GradeResume) {
        this.GradeResume = GradeResume;
    }

    public void setResult(String Result) {
        this.Result = Result;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Contest)) return false;
        final Contest other = (Contest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        if (this.getNumberResume() != other.getNumberResume()) return false;
        if (this.getNumberVacancies() != other.getNumberVacancies()) return false;
        if (this.getIdProfile() != other.getIdProfile()) return false;
        if (this.getIdResume() != other.getIdResume()) return false;
        if (this.getGradeResume() != other.getGradeResume()) return false;
        final Object this$Result = this.getResult();
        final Object other$Result = other.getResult();
        if (this$Result == null ? other$Result != null : !this$Result.equals(other$Result)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Contest;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        result = result * PRIME + this.getNumberResume();
        result = result * PRIME + this.getNumberVacancies();
        result = result * PRIME + this.getIdProfile();
        result = result * PRIME + this.getIdResume();
        result = result * PRIME + this.getGradeResume();
        final Object $Result = this.getResult();
        result = result * PRIME + ($Result == null ? 43 : $Result.hashCode());
        return result;
    }

    public String toString() {
        return "Contest(id=" + this.getId() + ", NumberResume=" + this.getNumberResume() + ", NumberVacancies=" + this.getNumberVacancies() + ", IdProfile=" + this.getIdProfile() + ", IdResume=" + this.getIdResume() + ", GradeResume=" + this.getGradeResume() + ", Result=" + this.getResult() + ")";
    }
}
