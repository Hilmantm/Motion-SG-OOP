public class Main {

    public static void main(String[] args) {
        Customer hilman = new Customer("Hilman");
        hilman.addToCart(new Mobil("Fortuner", 50000000, 1));
        hilman.addToCart(new Elektronik("Handphone", 200000f, 2));
        hilman.showSummary();
    }

}
