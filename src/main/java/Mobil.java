public class Mobil extends Kendaraan {


    public Mobil(String nama, float harga, int jumlah) {
        super(nama, harga, jumlah);
    }

    public String tipe() {
        return "Kendaraan Road Empat atau Mobil";
    }

    public String maju(int kecepatan) {
        return "Maju dengan batas " + kecepatan;
    }
}
