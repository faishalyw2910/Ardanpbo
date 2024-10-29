public class KamarSuite extends Kamar {
    private String fasilitasTambahan;

    public KamarSuite(int nomorKamar, double harga, String fasilitasTambahan) {
        super(nomorKamar, harga);
        this.fasilitasTambahan = fasilitasTambahan;
    }

    public String getFasilitasTambahan() {
        return fasilitasTambahan;
    }

    @Override
    public String getTipeKamar() {
        return "Kamar Suite";
    }
}