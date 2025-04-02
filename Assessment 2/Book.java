import java.util.*;
//Organizing a Library Management System
class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void display() {
        System.out.println("Book: " + title + " by " + author);
    }

    public static void main(String[] args) {
        Book b1 = new Book("Java Programming", "James Gosling");
        b1.display();
    }
}