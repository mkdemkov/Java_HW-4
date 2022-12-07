package homework;

import homework.Model.Book;
import homework.Json.JsonParser;
import homework.Model.BookReader;
import homework.Model.Library;
import homework.Static.ParseInput;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            JsonParser jsonParser = new JsonParser("src/main/java/homework/Json/books.json"); // создаем объект нашего класса
            ArrayList<Book> books = jsonParser.getBooksFromJson(); // получаем список книг из json файла
            Library library = new Library(books);
            BookReader bookReader = new BookReader(ParseInput.parseReaderName());
            ParseInput.parseCommands(bookReader, library);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}