package models;

public abstract class Document {
    private String typeDocument;

    public Document(String typeDocument) {
        this.typeDocument = typeDocument;
    }

    public String getTypeDocument() {
        return typeDocument;
    }

    public void setTypeDocument(String typeDocument) {
        this.typeDocument = typeDocument;
    }

}
