package models;

import java.util.List;

public class Person extends Document {
    private String name;
    private Integer document;
    private String address;
    private Integer houseNumber;
    private List<String> attributes;

    public Person(
            String typeDocument,
            String name,
            Integer document,
            String address,
            Integer houseNumber,
            List<String> attributes
    ) {
        super(typeDocument);
        this.name = name;
        this.document = document;
        this.address = address;
        this.houseNumber = houseNumber;
        this.attributes = attributes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDocument() {
        return document;
    }

    public void setDocument(Integer document) {
        this.document = document;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(Integer houseNumber) {
        this.houseNumber = houseNumber;
    }

    public List<String> getAttributes() {
        return attributes;
    }

//    public void setAttributes(List<String> attributes) {
//        this.attributes = attributes;
//    }

    public void addAttributes(String attribute) {
        attributes.add(attribute);
    }


}
