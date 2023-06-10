package com.example.recruitment.models;

import javax.persistence.*;

@Entity
@Table(name = "Director")
public class Director {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long Id;
    @Column(name = "FIO")
    private String FIO;
    @Column(name = "Birthdate")
    private String Birthdate;
    @Column(name = "IdHead")
    private int IdHead;

    public Director() {
    }

    public Long getId() {
        return this.Id;
    }

    public String getFIO() {
        return this.FIO;
    }

    public String getBirthdate() {
        return this.Birthdate;
    }

    public int getIdHead() {
        return this.IdHead;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public void setBirthdate(String Birthdate) {
        this.Birthdate = Birthdate;
    }

    public void setIdHead(int IdHead) {
        this.IdHead = IdHead;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Director)) return false;
        final Director other = (Director) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$Id = this.getId();
        final Object other$Id = other.getId();
        if (this$Id == null ? other$Id != null : !this$Id.equals(other$Id)) return false;
        final Object this$FIO = this.getFIO();
        final Object other$FIO = other.getFIO();
        if (this$FIO == null ? other$FIO != null : !this$FIO.equals(other$FIO)) return false;
        final Object this$Birthdate = this.getBirthdate();
        final Object other$Birthdate = other.getBirthdate();
        if (this$Birthdate == null ? other$Birthdate != null : !this$Birthdate.equals(other$Birthdate)) return false;
        if (this.getIdHead() != other.getIdHead()) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Director;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $Id = this.getId();
        result = result * PRIME + ($Id == null ? 43 : $Id.hashCode());
        final Object $FIO = this.getFIO();
        result = result * PRIME + ($FIO == null ? 43 : $FIO.hashCode());
        final Object $Birthdate = this.getBirthdate();
        result = result * PRIME + ($Birthdate == null ? 43 : $Birthdate.hashCode());
        result = result * PRIME + this.getIdHead();
        return result;
    }

    public String toString() {
        return "Director(Id=" + this.getId() + ", FIO=" + this.getFIO() + ", Birthdate=" + this.getBirthdate() + ", IdHead=" + this.getIdHead() + ")";
    }
}