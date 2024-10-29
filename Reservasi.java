public class Reservasi {
    private Tamu tamu;
    private Kamar kamar;
    private int lamaInap;

    public Reservasi(Tamu tamu, Kamar kamar, int lamaInap) {
        this.tamu = tamu;
        this.kamar = kamar;
        this.lamaInap = lamaInap;
    }

    public double hitungTotalBiaya() {
        return kamar.getHarga() * lamaInap;
    }

    public void tampilkanDetailReservasi() {
        System.out.println("ID Tamu: " + tamu.getIdTamu());
        System.out.println("Nama Tamu: " + tamu.getNama());
        System.out.println("Alamat Tamu: " + tamu.getAlamat());
        System.out.println("Nomor Kamar: " + kamar.getNomorKamar());
        System.out.println("Tipe Kamar: " + kamar.getTipeKamar());
        if (kamar instanceof KamarSuite) {
            System.out.println("Fasilitas Tambahan: " + ((KamarSuite) kamar).getFasilitasTambahan());
        }
        System.out.println("Lama Inap: " + lamaInap + " malam");
    }
}