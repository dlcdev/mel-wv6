package entities;

public class Client {
    private int id;
    private String name;
    private String middleName;

    public Client() {

    }

    public Client(int id, String name, String middleName) {
        this.id = id;
        this.name = name;
        this.middleName = middleName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ID: " + id);
        sb.append(" | Name: " + name);
        sb.append(" " + middleName);

        return sb.toString();
    }
}
