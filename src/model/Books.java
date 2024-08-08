package model;

import java.awt.print.Book;

public class Books {
    private int id;
    private int isbn;
    private String bookName;

    // -------- CONSTRUCTOR -----------
    public Books(){
    }

    public Books(int isbn, String bookName){
        this.isbn = isbn;
        this.bookName = bookName;
        this.id = id;
    }

    // Getter Setter method
    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getIsbn(){
        return isbn;
    }

    public void setIsbn(int isbn){
        this.isbn = isbn;
    }

    public String getBookName(){
        return bookName;
    }

    public void setBookName(String bookName){
        this.bookName = bookName;
    }
}
