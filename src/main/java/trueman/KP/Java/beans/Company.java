package ru.truemen.laba3.beans;

public class Company extends BaseEntity {
    private String Company_name;

    public String getName() {
        return Company_name;
    }

    public void setName(String Company_name) {
        this.Company_name = Company_name;
    }

    public String toString(){
        return super.getId() + " " + Company_name;
    }
}