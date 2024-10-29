import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Reservasi> daftarReservasi = new ArrayList<>();

        while (true) {
            System.out.println("\n--- Selamat Datang Di Hotel Selalu Tersenyum ---");
            System.out.println("1. Buat Reservasi");
            System.out.println("2. Lihat Semua Reservasi");
            System.out.println("3. Keluar");
            System.out.print("Pilih Opsi (1/2/3): ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    // Input data tamu
                    System.out.print("\nMasukkan ID Tamu: ");
                    String idTamu = scanner.nextLine();
                    System.out.print("Masukkan Nama Tamu: ");
                    String namaTamu = scanner.nextLine();
                    System.out.print("Masukkan Alamat Tamu: ");
                    String alamatTamu = scanner.nextLine();
                    Tamu tamu = new Tamu(idTamu, namaTamu, alamatTamu);

                    // Memilih tipe kamar
                    System.out.println("\nPilih Tipe Kamar:");
                    System.out.println("1. Kamar Dewasa (Rp 300000/malam)");
                    System.out.println("2. Kamar Anak (Rp 200000/malam)");
                    System.out.println("3. Kamar Suite (Rp 500000/malam dengan fasilitas tambahan)");
                    System.out.print("Pilihan Tipe Kamar (1/2/3): ");
                    int tipeKamar = scanner.nextInt();

                    Kamar kamar = null;
                    switch (tipeKamar) {
                        case 1:
                            kamar = new KamarDewasa(101, 300000);
                            break;
                        case 2:
                            kamar = new KamarAnak(102, 200000);
                            break;
                        case 3:
                            scanner.nextLine(); // Membersihkan buffer
                            System.out.print("Masukkan Fasilitas Tambahan untuk Kamar Suite: ");
                            String fasilitasTambahan = scanner.nextLine();
                            kamar = new KamarSuite(103, 500000, fasilitasTambahan);
                            break;
                        default:
                            System.out.println("Pilihan tidak valid!");
                            continue; // Kembali ke awal loop jika pilihan tidak valid
                    }

                    // Input lama inap
                    System.out.print("Masukkan Lama Inap (malam): ");
                    int lamaInap = scanner.nextInt();

                    // Membuat reservasi
                    Reservasi reservasi = new Reservasi(tamu, kamar, lamaInap);
                    daftarReservasi.add(reservasi);

                    System.out.println("\nReservasi Berhasil Dibuat!");
                    reservasi.tampilkanDetailReservasi();
                    System.out.println("Total Biaya: Rp " + reservasi.hitungTotalBiaya());
                    break;

                case 2:
                    if (daftarReservasi.isEmpty()) {
                        System.out.println("\nBelum ada reservasi yang dibuat.");
                    } else {
                        System.out.println("\n--- Daftar Reservasi ---");
                        for (Reservasi r : daftarReservasi) {
                            r.tampilkanDetailReservasi();
                            System.out.println("Total Biaya: Rp " + r.hitungTotalBiaya());
                            System.out.println("-----------------------------------");
                        }
                    }
                    break;

                case 3:
                    System.out.println("\nTerima kasih telah menggunakan Sistem Reservasi Hotel.");
                    scanner.close();
                    return; // Keluar dari program

                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        }
    }
}