public class KamarAnak extends Kamar {
    public KamarAnak(int nomorKamar, double harga) {
        super(nomorKamar, harga);
    }

    @Override
    public String getTipeKamar() {
        return "Kamar Anak";
    }
}