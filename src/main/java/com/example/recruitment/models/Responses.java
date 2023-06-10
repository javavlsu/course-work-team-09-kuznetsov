package com.example.recruitment.models;

import javax.persistence.*;

@Entity
@Table(name = "Responses")
public class Responses {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "name_post")
    private String name_post;
    @Column(name = "IdApplicant")
    private int IdApplicant;

    public Responses() {
    }

    public Long getId() {
        return this.id;
    }

    public String getName_post() {
        return this.name_post;
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

    public void setIdApplicant(int IdApplicant) {
        this.IdApplicant = IdApplicant;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Responses)) return false;
        final Responses other = (Responses) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$name_post = this.getName_post();
        final Object other$name_post = other.getName_post();
        if (this$name_post == null ? other$name_post != null : !this$name_post.equals(other$name_post)) return false;
        if (this.getIdApplicant() != other.getIdApplicant()) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Responses;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $name_post = this.getName_post();
        result = result * PRIME + ($name_post == null ? 43 : $name_post.hashCode());
        result = result * PRIME + this.getIdApplicant();
        return result;
    }

    public String toString() {
        return "Responses(id=" + this.getId() + ", name_post=" + this.getName_post() + ", IdApplicant=" + this.getIdApplicant() + ")";
    }
}
