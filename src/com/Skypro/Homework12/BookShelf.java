package com.Skypro.Homework12;

public class BookShelf {

    public static void main(String[] args) {
        Author author1 = new Author("Василий", "Маханенко");
        Book book1 = new Book(author1, "Путь Шамана", 2008);

        Author author2 = new Author("Андрей", "Сапковский");
        Book book2 = new Book(author2, "Ведьмак", 1993);

        System.out.println(author1);
        System.out.println(book1);

        System.out.println(author2);
        System.out.println(book2);
    }

}
