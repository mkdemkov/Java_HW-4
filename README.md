# Демков Михаил Кириллович БПИ212
# ДЗ №4
## Реализация 
_Реализована следующая логика:_
* пользовать вводит имя
* далее предлагается выбрать одну из следующих команд:
  * `/get book_name` - взять из библиотеки книгу с указанным названием
  * `/list` - посмотреть список ваших книг
  * `/put` вернуть одну из книг в библиотеку
  * `/all` - посмотреть список всех книг в библиотеке и их количество
  * `/exit` - выйти
* предусмотрена обработка некорректного ввода
* описание книг хранится в **json** формате
## Структура проекта
    homework - корень проекта
        Json - пакет для работы с json
            books.json - json-файл с описанием книг
            JsonParser - класс для парсинга json
        Model - пакет с описанием моделей
            Book - класс с описанием книги
            BookException - класс с кастомным исключением
            BookReader - класс с описанием читателя(пользователя)
            Library - класс с описанием библиотеки
        Static - пакет с описанием статичных классов
            Constants - класс с константами
            ParseInput - класс для парсинга входных данных
        Main - отсюда запуск
