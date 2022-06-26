package entities;

public class Competitors {
    private String name;
    private Integer age;
    private Integer document;
    private String phoneNumber;
    private String phoneEmergency;
    private String bloodGroup;
    private double subscription;

    public Competitors(
            String name,
            Integer age,
            Integer document,
            String phoneNumber,
            String phoneEmergency,
            String bloodGroup,
            double subscription
    ) {

        this.name = name;
        this.age = age;
        this.document = document;
        this.phoneNumber = phoneNumber;
        this.phoneEmergency = phoneEmergency;
        this.bloodGroup = bloodGroup;
        this.subscription = subscription;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getDocument() {
        return document;
    }

    public void setDocument(Integer document) {
        this.document = document;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneEmergency() {
        return phoneEmergency;
    }

    public void setPhoneEmergency(String phoneEmergency) {
        this.phoneEmergency = phoneEmergency;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public double getSubscription() {
        return subscription;
    }

    public void setSubscription(double subscription) {
        this.subscription = subscription;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name: " + name);
        sb.append(" - age: " + age);
        sb.append(" - document: " + document);
        sb.append(" - Phone Number: " + phoneNumber);
        sb.append(" - Phone Emergency: " + phoneEmergency);
        sb.append(" - Blood Group: " + bloodGroup);
        sb.append(" - Subscription: " + subscription);
        return sb.toString();

    }
}
