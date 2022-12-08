package homework.Model;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library(ArrayList<Book> books) {
        this.books = books;
    }

    /**
     * Получить все книги из библиотеки
     * @return список книг
     */
    public ArrayList<Book> getBooks() {
        return books;
    }

    /**
     * Вернуть книгу в библиотеку
     * @param book книга
     */
    public void returnBook(Book book) {
        books.add(book);
    }

    /**
     * Взять книгу из библиотеки
     * @param book книга
     */
    public void takeBook(Book book) {
        books.remove(book);
    }

    /**
     * Получить список всех книг из библиотеки и их количество
     */
    public void getAllBooks() {
        System.out.printf("В библиотеке есть следующие книги в количестве %d штук: \n", books.size());
        for (Book book : books) {
            System.out.print(" " + book);
        }
        System.out.print("\n");
    }
}
