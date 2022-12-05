package homework.Model;

import java.util.ArrayList;

public class Book {

    private String title;
    private String description; // описание книги
    private ArrayList<String> authors; // авторы
    private Long publishingYear; // год издания

    /**
     * Получить название книги
     *
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
    public Long getPublishingYear() {
        return publishingYear;
    }

    public Book(String title, String description, ArrayList<String> authors, Long publishingYear) {
        this.title = title;
        this.description = description;
        this.authors = authors;
        this.publishingYear = publishingYear;
    }

    /**
     * фактически переопределение toString для нашего класса
     * @return вывод книги в нужном формате
     */
    public String toString() {
        String res;
        // просто заморочка с согласованием падежей ))
        if (authors.size() == 1) {
            res = (String.format("\"%s\" была выпущена в %d году автором %s\n", title, publishingYear,
                    String.join(", ", authors)));
            return res;
        }
        res = (String.format("\"%s\" была выпущена в %d году авторами %s\n", title, publishingYear,
                String.join(", ", authors)));
        return res;
    }
}
