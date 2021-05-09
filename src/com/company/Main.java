package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Author author = new Author("Russel", "Winderand");
        Book book = new Book("title", author.getFirstName() + " " + author.getLastName(), 75.5);

        book.setTitle("Developing JAVA software");

        System.out.println(book.toString());

    }
}
