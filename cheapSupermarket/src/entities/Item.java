package entities;

public class Item {
    private int codeProduct;
    private String nameProduct;
    private int quantityProduct;
    private double costProduct;

    public Item(int codeProduct, String nameProduct, int quantityProduct, double costProduct) {
        this.codeProduct = codeProduct;
        this.nameProduct = nameProduct;
        this.quantityProduct = quantityProduct;
        this.costProduct = costProduct;
    }

    public int getCodeProduct() {
        return codeProduct;
    }

    public void setCodeProduct(int codeProduct) {
        this.codeProduct = codeProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getQuantityProduct() {
        return quantityProduct;
    }

    public void setQuantityProduct(int quantityProduct) {
        this.quantityProduct = quantityProduct;
    }

    public double getCostProduct() {
        return costProduct;
    }

    public void setCostProduct(double costProduct) {
        this.costProduct = costProduct;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Code: " + codeProduct);
        sb.append(" | name: " + nameProduct);
        sb.append(" | quantity: " + quantityProduct);
        sb.append(" | cost: " + costProduct);

        return sb.toString();
    }

}
