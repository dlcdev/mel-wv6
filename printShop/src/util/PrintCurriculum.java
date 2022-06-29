package util;

import models.Person;

public class PrintCurriculum implements Printer<Person> {

    @Override
    public void printOut(Person document) {
        StringBuilder sb = new StringBuilder();

        sb.append("| Name:" + document.getName());
        sb.append("\n| Document: " + document.getDocument());
        sb.append("\n| Address: " + document.getAddress());
        sb.append("\n| House number: " + document.getHouseNumber());
        sb.append("\n| Attributes: " + document.getAttributes());
        System.out.println("--Print the curriculum--\n");
        System.out.println(sb);

    }
}
