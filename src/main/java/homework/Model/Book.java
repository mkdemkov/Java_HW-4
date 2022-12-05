package homework.Model;

import java.util.ArrayList;

public class Book {
    private String description; // описание книги
    private ArrayList<String> authors; // авторы
    private int publishingYear; // год издания

    /**
     * Получение описания книги
     * @return описание
     */
    public String getDescription() {
        return description;
    }

    /**
     * Получение списка авторов или выброс исключения, если авторов нет
     * @return список авторов
     */
    public ArrayList<String> getAuthors() throws BookException {
        if (!authors.isEmpty())
            return authors;
        throw new BookException("Книга без авторов");
    }

    /**
     * Получение года издания книги
     * @return год издания
     */
    public int getPublishingYear() {
        return publishingYear;
    }

    public Book() {

    }
}
