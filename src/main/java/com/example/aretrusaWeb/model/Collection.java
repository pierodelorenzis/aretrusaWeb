package com.example.aretrusaWeb.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;


@Entity


public class Collection {

   @Id
   @GeneratedValue(strategy= GenerationType.AUTO)
    private String id;
    private String name;
    private Date startYear;
    private Date endYear;
    private Integer numBooks;

    public Collection(String id, String name, Date startYear, Date endYear, Integer numBooks) {
        this.id = id;
        this.name = name;
        this.startYear = startYear;
        this.endYear = endYear;
        this.numBooks = numBooks;
    }

   public Collection (){

   }

       public String getId() {
           return id;
       }

       public void setId(String id) {
           this.id = id;
       }

       public String getName() {
           return name;
       }

       public void setName(String name) {
           this.name = name;
       }

       public Date getStartYear() {
           return startYear;
       }

       public void setStartYear(Date startYear) {
           this.startYear = startYear;
       }

       public Date getEndYear() {
           return endYear;
       }

       public void setEndYear(Date endYear) {
           this.endYear = endYear;
       }

       public Integer getNumBooks() {
           return numBooks;
       }

       public void setNumBooks(Integer numBooks) {
           this.numBooks = numBooks;

   }

}
