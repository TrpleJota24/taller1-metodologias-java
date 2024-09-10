public class Gastos {
    private int id;
    private double amount;
    private String date;
    private String description;
    private String categrory;
    
    public Gastos(int id, double amount, String date, String description, String categrory) {
        this.id = id;
        this.amount = amount;
        this.date = date;
        this.description = description;
        this.categrory = categrory;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategrory() {
        return categrory;
    }

    public void setCategrory(String categrory) {
        this.categrory = categrory;
    }

    

}
