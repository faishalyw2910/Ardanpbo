public class KamarDewasa extends Kamar {
    public KamarDewasa(int nomorKamar, double harga) {
        super(nomorKamar, harga);
    }

    @Override
    public String getTipeKamar() {
        return "Kamar Dewasa";
    }
}
