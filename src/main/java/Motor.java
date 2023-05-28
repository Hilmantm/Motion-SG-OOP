public class Motor extends Kendaraan {


    public Motor(String nama, float harga, int jumlah) {
        super(nama, harga, jumlah);
    }

    public String tipe() {
        return "Kendaraan Roda Dua atau Motor";
    }

    public String maju(int kecepatan) {
        return "Maju dengan kecepatan maksimal " + kecepatan;
    }
}
