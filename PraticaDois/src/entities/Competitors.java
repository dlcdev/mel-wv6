package entities;


import java.util.List;

public class Competitors {

    private static final Double MINIMUM_VALUE_AGE = 1300.00;
    private static final double MAXIMUM_VALUE_AGE = 1500.00;
    private static final double MINIMUM_MEDIUM_VALUE_AGE = 2000.00;
    private static final double MAXIMUM_MEDIUM_VALUE_AGE = 2300.00;
    private static final double MAXIMUM_ADVANCED_VALUE_AGE = 2800.00;

    private Integer number;
    private String name;
    private Integer age;
    private Integer document;
    private String phoneNumber;
    private String phoneEmergency;
    private String bloodGroup;
    private double subscription;

    public Competitors() {

    }

    public Competitors(
            Integer number,
            String name,
            Integer age,
            Integer document,
            String phoneNumber,
            String phoneEmergency,
            String bloodGroup,
            double subscription
    ) {
        this.number = number;
        this.name = name;
        this.age = age;
        this.document = document;
        this.phoneNumber = phoneNumber;
        this.phoneEmergency = phoneEmergency;
        this.bloodGroup = bloodGroup;
        this.subscription = subscription;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
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

    public static double getTheRegistrationFee(int choice, int age, int minimumAge) {
        // Get The Registration Fee

        return switch (choice) {
            case 1 -> age < minimumAge ? MINIMUM_VALUE_AGE : MAXIMUM_VALUE_AGE;
            case 2 -> age < minimumAge ? MINIMUM_MEDIUM_VALUE_AGE : MAXIMUM_MEDIUM_VALUE_AGE;
            case 3 -> MAXIMUM_ADVANCED_VALUE_AGE;
            default -> {
                Double o = null;
                yield o;
            }
        };
    }

    public static boolean isParticipantExists(String name, List<Competitors> listCompetitors) {
        // Check this Participant Exists.

        if (listCompetitors.isEmpty()) {
            return false;
        }
        for (Competitors competitors : listCompetitors) {
            if (competitors.getName().toLowerCase().strip().equals(name.toLowerCase().strip())) {
                System.out.printf("This competitor: %s exist in data base.", name);
                return true;
            }
        }

        return false;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Number: " + number);
        sb.append(" | Name: " + name);
        sb.append(" | age: " + age);
        sb.append(" | document: " + document);
        sb.append(" | Phone Number: " + phoneNumber);
        sb.append(" | Phone Emergency: " + phoneEmergency);
        sb.append(" | Blood Group: " + bloodGroup);
        sb.append(" | Subscription: " + subscription);
        return sb.toString();

    }
}
