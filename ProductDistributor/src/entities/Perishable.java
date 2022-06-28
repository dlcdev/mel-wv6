package entities;

public class Perishable extends Product{
    private final int FIRST_DAY = 1;
    private final int SECOND_DAY = 2;
    private final int THIRD_DAY = 3;

    private int daysToExpiration;

    public Perishable(String name, Double price, int daysToExpiration) {
        super(name, price);
        this.daysToExpiration = daysToExpiration;
    }

    public int getDaysToExpiration() {
        return daysToExpiration;
    }

    public void setDaysToExpiration(int daysToExpiration) {
        this.daysToExpiration = daysToExpiration;
    }

    @Override
    public Double calculate(int quantityOfProducts) {
        double total;

        Double result = quantityOfProducts * super.getPrice();

        if (daysToExpiration == FIRST_DAY) {
            total = result / 4;
        } else if (daysToExpiration == SECOND_DAY) {
            total = result / 3;
        } else if (daysToExpiration == THIRD_DAY) {
            total = result / 2;
        } else {
            total = result;
        }

        return total;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Product: " + super.getName());
        sb.append(" | Price: " + super.getPrice());
        sb.append(" | Days of Expiration: " + daysToExpiration);
        return sb.toString();
    }


}
