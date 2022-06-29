package util;

import models.Report;

public class PrintReport implements Printer<Report> {
    @Override
    public void printOut(Report report) {
        StringBuilder sb = new StringBuilder();
        sb.append("| Quantity lines: " + report.getTextSize());
        sb.append("\n| Number of page: " + report.getPageNumber());
        sb.append("\n| Author: " + report.getAuthor());
        sb.append("\n| Reviewer: " + report.getReviewer());

        System.out.println("\n--Printing report--");
        System.out.println(sb);

    }
}
