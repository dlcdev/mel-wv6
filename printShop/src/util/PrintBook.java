package util;

import models.Book;

public class PrintBook implements Printer<Book> {


    @Override
    public void printOut(Book book) {
        StringBuilder sb = new StringBuilder();
        sb.append("| Title: " + book.getTitle());
        sb.append("\n| Author: " + book.getAuthorName());
        sb.append("\n| Genre: " + book.getGenre());
        sb.append("\n| Page Number: " + book.getPageNumber());

        System.out.println("\n--Print the book--\n");
        System.out.println(sb);

    }
}
