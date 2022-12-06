package homework.Static;

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
}
