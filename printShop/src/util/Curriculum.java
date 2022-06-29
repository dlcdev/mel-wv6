package util;

import models.Person;

import javax.print.DocFlavor;

public class Curriculum implements Printer<Person>{

    @Override
    public void printOut(Person document) {
        StringBuilder sb = new StringBuilder();

        sb.append("Name + " + document.getName());
        System.out.println("Print the: " + document.getTypeDocument());
        System.out.println(sb);

    }
}
