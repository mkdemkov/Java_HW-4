package homework.Model;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library(ArrayList<Book> books) {
        this.books = books;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void returnBook(Book book) {
        books.add(book);
    }

    public void takeBook(Book book) {
        books.remove(book);
    }

    public void getAllBooks() {
        System.out.println("В библиотеке есть следующие книги: ");
        for (Book book : books) {
            System.out.print(" " + book);
        }
        System.out.print("\n");
    }
}
