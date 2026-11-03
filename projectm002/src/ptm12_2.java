class Orang {
    protected String nama;

    public Orang(String nama) {
        this.nama = nama;
    }

    public void tampilNama() {
        System.out.println("==================================");
        System.out.println("Nama        : " + nama);
    }
}

class Pegawai extends Orang {
    protected String nip;

    public Pegawai(String nama, String nip) {
        super(nama);
        this.nip = nip;
    }

    public void tampilPegawai() {
        tampilNama();
        System.out.println("-----------------------------------");
        System.out.println("NIP         : " + nip);
    }
}

class Manajer extends Pegawai {
    private String departemen;

    public Manajer(String nama, String nip, String departemen) {
        super(nama, nip);
        this.departemen = departemen;
    }

    public void tampilManajer() {
        tampilPegawai();
        System.out.println("Departemen  : " + departemen);
        System.out.println("==================================");
    }
}

public class ptm12_2 {
    public static void main(String[] args) {
        Manajer m = new Manajer("Shaka Banuasta", "251011700140", "Game Development");
        m.tampilManajer();
    }
}