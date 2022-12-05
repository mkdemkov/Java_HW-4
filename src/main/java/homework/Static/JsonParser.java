package homework.Static;

import homework.Model.Book;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class JsonParser {
    private Object fullJson;
    private String path; // путь до json файла

    public JsonParser(String path) {
        this.path = path;
    }

    /**
     * получение списка книг из json файла
     *
     * @return список книг
     */
    public ArrayList<Book> getBooksFromJson() {
        ArrayList<Book> books = new ArrayList<>();
        try {
            fullJson = new JSONParser().parse(new FileReader(path));
            JSONArray jsonBooks = (JSONArray) fullJson; // получаем массив json'ов на основе единого json объекта
            for (Object o : jsonBooks) { // проходимся по всем json объекта (книгам в нашем случае)
                JSONObject jo = (JSONObject) o;
                String title = (String) jo.get("title"); // название
                String description = (String) jo.get("description"); // описание
                Long publishingYear = (Long) jo.get("publishingYear"); // год издания
                JSONArray jsonAuthors = (JSONArray) jo.get("authors"); // авторы в формате массива json'ов (вложенный json)
                ArrayList<String> authors = new ArrayList<>();
                for (Object oo : jsonAuthors) { // проходимся по всем json объектам (авторам)
                    JSONObject oj = (JSONObject) oo;
                    String lastName = (String) oj.get("lastName");
                    String name = (String) oj.get("name");
                    String fullName = lastName + " " + name; // получаем фамилию и имя единой строкой (как надо)
                    authors.add(fullName);
                }
                Book book = new Book(title, description, authors, publishingYear);
                books.add(book);
            }
        } catch (IOException | ParseException ex) { // на всякий случай ловим возможные эксепшены
            System.out.println(ex.getMessage());
        }
        return books;
    }
}
