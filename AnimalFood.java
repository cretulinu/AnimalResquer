import java.time.LocalDate;

public class AnimalFood{
    private String name;
    private double price;
    private int quantity;
    private LocalDate expirationDate;
    private boolean isAvailableInStock;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public LocalDate getExpirationDate() {
        return expirationDate;
    }
    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }
    public boolean getIsAvailableInStock() {
        return isAvailableInStock;
    }
    public void setIsAvailableInStock(boolean isAvailableInStock) {
        this.isAvailableInStock = isAvailableInStock;
    }
}