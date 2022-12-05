package homework.Model;

/**
 * Класс, описывающий исключение при работе с книгами
 */
public class BookException extends Exception {
    public BookException(String message) {
        super(message);
    }
}
