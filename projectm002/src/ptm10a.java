// 1. ABSTRACTION (Kerangka dasar tiket)
abstract class Tiket {
    // 2. ENCAPSULATION (Data dikunci agar aman)
    private String namaPenumpang;
    private double hargaDasar;

    public Tiket(String nama, double harga) {
        this.namaPenumpang = nama;
        this.hargaDasar = harga;
    }

    public String getNamaPenumpang() { return namaPenumpang; }
    public double getHargaDasar() { return hargaDasar; }

    abstract void cetakTiket(); // Metode abstrak
}

// 3. INHERITANCE (TiketKonser mewarisi sifat Tiket)
class TiketKonser extends Tiket {
    public TiketKonser(String nama, double harga) {
        super(nama, harga);
    }

    // 4. POLYMORPHISM (Bentuk cetak khusus konser)
    @Override
    void cetakTiket() {
        double subtotal = getHargaDasar();
        double total = getHargaDasar() + 50000; // Harga + Pajak Konser
        System.out.println("=============== Ticket Konser ===============");
        System.out.println("Nama    : " + getNamaPenumpang());
        System.out.println("---------------------------------------------");
        System.out.println("Harga   : " + subtotal);
        System.out.println("Pajak   : " + 50000);
        System.out.println("Total   : " + total);
        System.out.println("---------------------------------------------");
        System.out.println("======== Terimakasih Telah Memesan ==========");
        System.out.println();
    }
}

// 3. INHERITANCE (TiketBioskop mewarisi sifat Tiket)
class TiketBioskop extends Tiket {
    public TiketBioskop(String nama, double harga) {
        super(nama, harga);
    }

    // 4. POLYMORPHISM (Bentuk cetak khusus bioskop)
    @Override
    void cetakTiket() {
        double subtotal = getHargaDasar();
        double total = getHargaDasar() + 5000; // Harga + Admin Bioskop
        System.out.println("=============== Ticket Biskop ===============");
        System.out.println("Nama    : " + getNamaPenumpang());
        System.out.println("---------------------------------------------");
        System.out.println("Harga   : " + subtotal);
        System.out.println("Pajak   : " + 5000);
        System.out.println("Total   : " + total);
        System.out.println("---------------------------------------------");
        System.out.println("======== Terimakasih Telah Memesan ==========");
        System.out.println();
    }
}

// KELAS UTAMA ANDA
public class ptm10a {
    public static void main(String[] args){
        // Catatan: PBO singkatan dari Pemrograman Berorientasi Objek (bukan Procedural)
        System.out.println("--- SISTEM PEMESANAN TIKET (OOP/PBO) ---");

        // Penerapan POLYMORPHISM saat memesan tiket
        Tiket tiket1 = new TiketKonser("Shaka", 500000);
        Tiket tiket2 = new TiketBioskop("Banu", 45000);

        // Memanggil metode yang sama, menghasilkan output berbeda
        tiket1.cetakTiket();
        tiket2.cetakTiket();
    }
}
