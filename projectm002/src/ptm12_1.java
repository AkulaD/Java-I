class Kendaraan {
    protected String merek;
    protected int tahunProduksi;

    public Kendaraan(String merek, int tahunProduksi) {
        this.merek = merek;
        this.tahunProduksi = tahunProduksi;
    }

    public void tampilKendaraan() {
        System.out.println("==================================");
        System.out.println("Merek           : " + merek);
        System.out.println("Tahun Produksi  : " + tahunProduksi);
    }
}

class Mobil extends Kendaraan {
    private int jumlahPintu;

    public Mobil(String merek, int tahunProduksi, int jumlahPintu) {
        super(merek, tahunProduksi);
        this.jumlahPintu = jumlahPintu;
    }

    public void tampilMobil() {
        tampilKendaraan();
        System.out.println("Jumlah Pintu    : " + jumlahPintu);
        System.out.println("==================================");
    }
}

public class ptm12_1 {
    public static void main(String[] args) {
        Mobil m = new Mobil("Mitsubishi Type 10", 2012, 2);
        m.tampilMobil();
    }
}