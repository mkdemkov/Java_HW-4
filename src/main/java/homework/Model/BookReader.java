package homework.Model;

import java.util.ArrayList;
import java.util.Arrays;

public class BookReader {

    private final String name;

    private ArrayList<Book> books = new ArrayList<>();

    public BookReader(String name) {
        this.name = name;
    }

    public void getBook(Library library, String name) {

    }

    public void getAllBooks() {

    }

    public void putBook(Library library) {

    }

    public String toString() {
        // страшный вывод, но красивый
        return String.format("У читателя %s есть следующие книги:\n %s", name, String.join("",
                Arrays.toString(books.toArray()).replace("[", "").replace("]",
                        "").replace(", \"", " \"")));
    }
}
