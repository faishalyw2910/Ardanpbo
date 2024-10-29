public class Tamu {
    private String idTamu;
    private String nama;
    private String alamat;

    public Tamu(String idTamu, String nama, String alamat) {
        this.idTamu = idTamu;
        this.nama = nama;
        this.alamat = alamat;
    }

    public String getIdTamu() {
        return idTamu;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }
}