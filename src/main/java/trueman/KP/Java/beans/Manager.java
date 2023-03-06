package ru.truemen.laba3.beans;

import java.util.Date;

    public class Manager extends BaseEntity
    {
        private String Manager_name;
        private String Manager_surname;
        private Date Manager_birthdate;
        private long Manager_companyid;

        public Manager(String Manager_name, String Manager_surname, Date Manager_birthdate, long Manager_companyid)
        {
            this.Manager_name = Manager_name;
            this.Manager_surname = Manager_surname;
            this.Manager_birthdate = Manager_birthdate;
            this.Manager_companyid= Manager_companyid;
        }
        public Manager() {
        }
        public String getName()
        {
            return Manager_name;
        }

        public void setName(String Manager_name)
        {
            this.Manager_name = Manager_name;
        }

        public String getSurname()
        {
            return Manager_surname;
        }

        public void setSurname(String Manager_surname)
        {
            this.Manager_surname = Manager_surname;
        }

        public Date getBirthdate()
        {
            return Manager_birthdate;
        }

        public void setBirthdate(Date Manager_birthdate)
        {
            this.Manager_birthdate = Manager_birthdate;
        }

        public long getCompanyid()
        {
            return Manager_companyid;
        }

        public void setCompanyid(long Manager_companyid)
        {
            this.Manager_companyid = Manager_companyid;
        }

        public String toString()
        {
            return super.getId() +  " " + this.Manager_surname + " " + this.Manager_name + " " + this.Manager_birthdate.toString() + " " + this.Manager_companyid;
        }
    }
