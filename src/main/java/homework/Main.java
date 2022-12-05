package homework;

import homework.Model.Book;
import homework.Static.JsonParser;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            JsonParser jsonParser = new JsonParser("src/main/java/homework/books.json"); // создаем объект нашего класса
            ArrayList<Book> books = jsonParser.getBooksFromJson(); // получаем список книг из json файла
            for (Book book : books) {
                System.out.println(book);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}