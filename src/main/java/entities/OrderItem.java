
package entities;

public class OrderItem {
    
    private Integer quantity;
    private Double price;

    private Product product;
    
    public OrderItem() {

    }

    public OrderItem(Double price, Product product, Integer quantity) {
        this.price = price;
        this.product = product;
        this.quantity = quantity;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double subTotal() {
        return price * quantity;
    }
    @Override
    public String toString() {
        return getProduct().getName()
        + ", $"
        + String.format("%.2f", price)
        + ", Quantity: "
        + quantity
        + ", Subtotal: $"
                + String.format("%.2f", subTotal());
    }
}
