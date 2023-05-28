public abstract class Kendaraan extends Product {


    public Kendaraan(String nama, float harga, int jumlah) {
        super(nama, harga, jumlah);
    }

    public abstract String tipe();

    public String maju() {
        return "Maju";
    }

}
