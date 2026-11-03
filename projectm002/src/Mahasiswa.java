// Enkapsulasi
// Class Mahasiswa untuk pertemuan 11 (ptm10.java - Encapsulation)
public class Mahasiswa {
    private String nama;
    private int nim;
    private String kelas;

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setNim(int nim){
        this.nim = nim;
    }

    public void setKelas(String kelas){
        this.kelas = kelas;
    }

    public String getNama(){
        return this.nama;
    }

    public int getNim(){
        return this.nim;
    }

    public String getKelas(){
        return this.kelas;
    }
}

class KetuaKelas extends Mahasiswa{
    private String jabatan;

    public void setJabatan(String jabatan){
        this.jabatan = jabatan;
    }

    public String getJabatan(){
        return this.jabatan;
    }
}