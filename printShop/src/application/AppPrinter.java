package application;

import models.Book;
import models.Person;
import models.Report;
import util.PrintBook;
import util.PrintCurriculum;
import util.PrintReport;

import java.util.List;

public class AppPrinter {
    public static void main(String[] args) {

        String typeDocument = "Curriculum";
        String name = "Bob";
        int document = 11223332;
        String addressHouse = "Rua Bonzano";
        int houseNumber = 11;
        List<String> listAtrributes = List.of("Java course", "MBA", "technology", "dance");

        Person doc1 = new Person(typeDocument, name, document, addressHouse, houseNumber, listAtrributes);
        PrintCurriculum curriculum = new PrintCurriculum();
        curriculum.printOut(doc1);

        String title = "Ashoka";
        String authorName = "E. K. Johnston";
        String genre = "Science fiction";
        int pageNumber = 384;
        Book book = new Book("Book", title, authorName, genre, pageNumber);

        PrintBook book1 = new PrintBook();
        book1.printOut(book);

        int textSize = 200;
        pageNumber = 100;
        String author = "Bob2";
        String reviewer = "Brother Bob2";

        Report report = new Report("Report", textSize, pageNumber, author, reviewer);
        PrintReport report1 = new PrintReport();
        report1.printOut(report);

    }
}
