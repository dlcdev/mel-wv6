package models;

public class Report extends Document{

    private Integer textSize;
    private Integer pageNumber;
    private String author;
    private String reviewer;

    public Report(String typeDocument, Integer text, Integer pageNumber, String author, String reviewer) {
        super(typeDocument);
        this.textSize = text;
        this.pageNumber = pageNumber;
        this.author = author;
        this.reviewer = reviewer;
    }

    public Integer getText() {
        return textSize;
    }

    public void setText(Integer text) {
        this.textSize = text;
    }

    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getReviewer() {
        return reviewer;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }
}
