package homework.Model;

import java.util.ArrayList;
import java.util.Arrays;

public class BookReader {

    private final String name;

    private ArrayList<Book> books;

    public BookReader(String name, ArrayList<Book> books) {
        this.name = name;
        this.books = books;
    }

    public String toString() {
        // страшный вывод, но красивый
        return String.format("У читателя %s есть следующие книги:\n %s", name, String.join("",
                Arrays.toString(books.toArray()).replace("[", "").replace("]",
                        "").replace(", \"", " \"")));
    }
}
