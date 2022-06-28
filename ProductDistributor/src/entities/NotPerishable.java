package entities;

public class NotPerishable extends Product{
    private String type;

    public NotPerishable(String name, Double price, String type) {
        super(name, price);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public Double calculate(int quantityOfProducts) {
        return quantityOfProducts * super.getPrice();
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Product: " + super.getName());
        sb.append(" | Price: " + super.getPrice());
        sb.append("Type: " + type);
        return sb.toString();
    }


}
