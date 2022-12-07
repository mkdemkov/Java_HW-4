package homework.Static;

public class Constants {
    private Constants() {
        throw new RuntimeException("Нельзя создать объект этого класса");
    }

    public static final String COMMANDS = """
            Список доступных команд:\040\040
             /get book_name - взять книгу из библиотеки\040\040
             /list - посмотреть список ваших книг\040\040
             /put book_name - вернуть книгу в библиотеку\040\040
             /all - получить список всех книг в библиотеке и их количество\040\040
             /exit - выйти""";
}
