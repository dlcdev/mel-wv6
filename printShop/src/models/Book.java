package models;

public class Book extends Document {


    private String title;
    private String authorName;
    private String genre;
    private int pageNumber;

    public Book(String typeDocument, String title, String authorName, String genre, int pageNumber) {
        super(typeDocument);
        this.title = title;
        this.authorName = authorName;
        this.genre = genre;
        this.pageNumber = pageNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }
}
