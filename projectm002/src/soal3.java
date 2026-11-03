class Mahasiswa {
    String nama;
    String nim;
    String kelas;
    double nilai;

    public Mahasiswa(String nama, String nim, String kelas, double nilai) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        this.nilai = nilai;
    }

    public void tampilData() {
        System.out.println("Nama  : " + nama);
        System.out.println("NIM   : " + nim);
        System.out.println("Kelas : " + kelas);
        System.out.println("Nilai : " + nilai);
        System.out.println("Status: " + (isLulus() ? "Lulus" : "Tidak Lulus"));
    }

    public boolean isLulus() {
        return nilai > 60;
    }
}

public class soal3 {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("Budi Santoso", "20250001", "01SIFP001", 75.5);
        mhs.tampilData();
    }
}