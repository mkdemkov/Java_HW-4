package homework.Static;

import homework.Model.BookReader;
import homework.Model.Library;

import java.util.Scanner;

public class ParseInput {
    private static Scanner scanner = new Scanner(System.in);

    private ParseInput() {
        throw new RuntimeException("Нельзя создать объект этого класса");
    }

    public static String parseReaderName() {
        System.out.print("Как тебя зовут? ");
        return scanner.nextLine();
    }

    public static void parseCommands(BookReader bookReader, Library library) {
        System.out.println(Constants.COMMANDS);
        String command = scanner.nextLine();
        do {
            if (command.startsWith("/get")) {
                String name = parseBookName(command);
                bookReader.getBook(library, name);
            } else if (command.startsWith("/list")) {
                bookReader.showAllBooks();
            } else if ("/put".equals(command)) {
                bookReader.putBook(library);
            } else if (command.startsWith("/all")) {
                library.getAllBooks();
            } else {
                System.out.println("Неверная команда");
            }
            System.out.println(Constants.COMMANDS);
            command = scanner.nextLine();
        } while (!"/exit".equals(command));
    }

    public static String parseBookName(String command) {
        return command.replace("/get ", "").trim();
    }
}
