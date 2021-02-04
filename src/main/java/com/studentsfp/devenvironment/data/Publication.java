package com.studentsfp.devenvironment.data;

public class Publication {
    //variables - atributos
    String isbn;
    String title;
    String year;

    //constructor
    //por qué creamos un constructor vacío?
    //public Publication(long l, String format){}
    public Publication(String isbn,String title,String year){
        this.isbn=isbn;
        this.title=title;
        this.year=year; //setYear();
    }

    public Publication() { }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
