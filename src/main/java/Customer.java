import java.time.LocalDate;

public class Customer {
    
    private String nama;
    private Cart cart;

    public Customer(String nama) {
        this.nama = nama;
        this.cart = new Cart(LocalDate.now().toString());
    }

    public int addToCart(Product product) {
        return cart.addProduct(product);
    }

    public void showSummary() {
        System.out.println("Customer\t: " + nama);
        cart.display();
    }
}
