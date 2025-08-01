public class AnimalFood{
    String nume;
    public String getNume() {
        return nume;
    }
    public void setNume(String nume) {
        this.nume = nume;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
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
    public boolean isAvailableInStock() {
        return isAvailableInStock;
    }
    public void setAvailableInStock(boolean isAvailableInStock) {
        this.isAvailableInStock = isAvailableInStock;
    }
    int price;
    int quantity;
    LocalDate expirationDate;
    boolean isAvailableInStock;
}