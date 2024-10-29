public class Kamar {
    private int nomorKamar;
    private double harga;

    public Kamar(int nomorKamar, double harga) {
        this.nomorKamar = nomorKamar;
        this.harga = harga;
    }

    public int getNomorKamar() {
        return nomorKamar;
    }

    public double getHarga() {
        return harga;
    }

    public String getTipeKamar() {
        return "Kamar Biasa";
    }
}