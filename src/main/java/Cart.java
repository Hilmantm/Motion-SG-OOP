import java.util.ArrayList;
import java.util.Map;

public class Cart {

    private String date;
    private ArrayList<Product> listProduct;

    public Cart(String date) {
        this.date = date;
        this.listProduct = new ArrayList<>();
    }

    public int addProduct(Product newProduct) {
        listProduct.add(newProduct);
        return 1;
    }

    public void display() {
        float totalPrice = 0;
        System.out.println("Cart\t\t: " + date);
        System.out.println("==========================");
        for (int i = 0; i < listProduct.size(); i++) {
            float hargaProduct = listProduct.get(i).getHarga() *
                    listProduct.get(i).getJumlah();
            System.out.println("No\t\t: " + (i+1));
            System.out.println("Nama\t: " + listProduct.get(i).getNama());
            if (listProduct.get(i) instanceof Kendaraan) {
                System.out.println("Tipe\t: " + ((Kendaraan) listProduct.get(i)).tipe());
            }
            System.out.println("Harga\t: " + listProduct.get(i).getHarga());
            System.out.println("Jumlah\t: " + listProduct.get(i).getJumlah());
            System.out.println("Total harga\t: " + hargaProduct);
            totalPrice += hargaProduct;
            System.out.println(); // digunakan untuk membuat baris baru
        }

        System.out.println();
        System.out.println("Total harga keseluruhan: " + totalPrice);
    }

}
