public class Ingredient {

    private String ingridientName;
    private double amount;

    public Ingredient(String ingridientName, double amount) {
        this.ingridientName = ingridientName;
        this.amount = amount;
    }

    public String getIngridientName() {
        return ingridientName;
    }

    public void setIngridientName(String ingridientName) {
        this.ingridientName = ingridientName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
