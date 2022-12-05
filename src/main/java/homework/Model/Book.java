package homework.Model;

import java.util.ArrayList;

public class Book {

    private String title;
    private String description; // описание книги
    private ArrayList<String> authors; // авторы
    private int publishingYear; // год издания

    /**
     * Получить название книги
     * @return название книги
     */
    public String getTitle() {
        return title;
    }

    /**
     * Получение описание книги
     *
     * @return описание
     */
    public String getDescription() {
        return description;
    }

    /**
     * Получение списка авторов или выброс исключения, если авторов нет
     *
     * @return список авторов
     */
    public ArrayList<String> getAuthors() throws BookException {
        if (!authors.isEmpty())
            return authors;
        throw new BookException("Книга без авторов");
    }

    /**
     * Получение года издания книги
     *
     * @return год издания
     */
    public int getPublishingYear() {
        return publishingYear;
    }

    public Book(String title, String description, ArrayList<String> authors, int publishingYear) {
        this.title = title;
        this.description = description;
        this.authors = authors;
        this.publishingYear = publishingYear;
    }

    public void printBook() {
        // нужен фикс при выводе авторов
        System.out.printf("\"%s\" была выпущена в %d году авторами - %s", title, publishingYear, authors.toString());
    }
}
