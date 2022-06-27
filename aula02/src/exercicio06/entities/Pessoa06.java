package exercicio06.entities;

public class Pessoa06 {
    public String id;
    public String name;
    public Integer age;
    public Double weight;
    public Double height;

    public Pessoa06() {

    }


    public Pessoa06(String id, String name, Integer age, Double weight, Double height) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public String calculateImc() {
        double value = weight / Math.pow(height, 2);

        if (value < 20) {
            return "Abaixo do peso";

        } else if (value >= 20 && value <= 25) {
            return "Peso Saudável";
        } else {
            return "Sobrepso";
        }

    }

    public boolean ehMoreAge(int age) {
        if (age < 18) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                ", imc=" + calculateImc() +
                '}';
    }

}
