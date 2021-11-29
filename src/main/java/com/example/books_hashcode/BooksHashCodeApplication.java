
//Przy użyciu wewnętrznego edytora Kodilla napisz program, który będzie przechowywał w zbiorze HashSet zestaw kilku obiektów reprezentujących książki.
//Każda książka powinna mieć tytuł, autora i rok wydania.
//Nie zapomnij również o zdefiniowaniu metod hashCode() oraz equals() dla swoich książek.
//Następnie przy pomocy poznanej w poprzednim module pętli for-each wyświetl w oknie konsoli tytuły wszystkich książek znajdujących się w zbiorze, które zostały wydane przed 2010 rokiem.

package com.example.books_hashcode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;

class Book {
    String title;
    String author;
    int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public int hashCode() {
        return year;
    }

    public boolean equals(Object o) {
        Book b = (Book) o;
        return (title.equals(b.getTitle())) &&
                (author.equals(b.getAuthor())) &&
                (year == b.getYear());
    }

    public String toString() {
        return title + ", " + author + ", release: " + year;
    }
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }
}

@SpringBootApplication
public class BooksHashCodeApplication {

    public static void main(String[] args) {
        SpringApplication.run(BooksHashCodeApplication.class, args);
    } {

        Book position1 = new Book("Hubal", "Komuda", 1987);
        Book position2 = new Book("Wiedźmin", "Sapkowski", 2001);
        Book position3 = new Book("Eragon", "Paolini", 2003);
        Book position4 = new Book("Dzieci Hurina", "Tolkien", 2007);
        Book position5 = new Book("Oskarżona: Wiera Gran","Tuszyńska", 2011);
        Book position6 = new Book("Droga Królów","Sanderson", 2014);
        Book position7 = new Book("Pielgrzym", "Terry Hayes", 2014);


        HashSet<Book> positionsSet = new HashSet<Book>();
        positionsSet.add(position1);
        positionsSet.add(position2);
        positionsSet.add(position3);
        positionsSet.add(position4);
        positionsSet.add(position5);
        positionsSet.add(position6);
        positionsSet.add(position7);

        for(Book theBook: positionsSet) {
            if (theBook.getYear() <=2010) {
                System.out.println(theBook);
            }
        }

    }

}
