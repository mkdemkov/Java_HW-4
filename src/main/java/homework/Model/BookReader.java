package homework.Model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BookReader {
    private static Scanner scanner = new Scanner(System.in);

    private final String name;

    private ArrayList<Book> books = new ArrayList<>();

    public BookReader(String name) {
        this.name = name;
    }

    public void getBook(Library library, String name) {
        ArrayList<Book> niceBooks = new ArrayList<>();
        for (Book book : library.getBooks()) {
            if (book.getTitle().equals(name)) {
                niceBooks.add(book);
            }
        }
        if (niceBooks.size() == 1) {
            books.add(niceBooks.get(0));
            library.takeBook(niceBooks.get(0));
            System.out.printf("Книга \"%s\" взята из библиотеки\n\n", niceBooks.get(0).getTitle());
        } else if (niceBooks.isEmpty()) {
            System.out.println("Книги с таким названием нет в библиотеке\n");
        } else {
            System.out.printf("Выберите, какую из %d книг вы хотите взять?\n", niceBooks.size());
            int number = getCorrectIndex();
            while (!(number >= 1 && number <= niceBooks.size())) {
                System.out.printf("Введите число из диапазона от 1 до %d\n", niceBooks.size());
                number = getCorrectIndex();
            }
            System.out.printf("Книга \"%s\" взята из библиотеки\n\n", niceBooks.get(number - 1).getTitle());
            books.add(niceBooks.get(number - 1));
            library.takeBook(niceBooks.get(number - 1));
        }
    }

    private int getCorrectIndex() {
        while (!scanner.hasNextInt()) {
            System.out.println("Введено не число, попробуй еще раз!");
            scanner.nextLine(); // заглушка от бесконечного цикла
        }
        return scanner.nextInt();
    }

    public void showAllBooks() {
        if (books.isEmpty()) {
            System.out.println("У вас нет книг!\n");
            return;
        }
        System.out.println("У вас есть следующие книги:");
        for (Book book : books) {
            System.out.print(" " + book);
        }
        System.out.print("\n");
    }

    public void putBook(Library library) {
        System.out.println("Какую из книг вы хотите вернуть?");
        int index = 1;
        for (Book book : books) {
            System.out.println(index++ + ". " + book.getTitle());
        }
        System.out.printf("Введите число от 1 до %d\n", books.size());
        System.out.printf("Выберите, какую из %d книг вы хотите взять?\n", books.size());
        int number = getCorrectIndex();
        while (!(number >= 1 && number <= books.size())) {
            System.out.printf("Введите число из диапазона от 1 до %d\n", books.size());
            number = getCorrectIndex();
        }
        Book book = books.get(number - 1);
        books.remove(book);
        library.returnBook(book);
        System.out.printf("Книга \"%s\" возвращена в библиотеку\n\n", book.getTitle());
    }

    public String toString() {
        // страшный вывод, но красивый
        return String.format("У читателя %s есть следующие книги:\n %s\n", name, String.join("",
                Arrays.toString(books.toArray()).replace("[", "").replace("]",
                        "").replace(", \"", " \"")));
    }
}
