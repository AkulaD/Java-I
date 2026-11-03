import java.util.Scanner;

public class ptm10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Soal Pertama:
        System.out.println("=====================================");
        System.out.print("Masukan nilai : ");
        int nilai = input.nextInt();

        if (nilai >= 85) {
            System.out.println("Nilai anda A");
        } else if (nilai >= 70) {
            System.out.println("Nilai anda B");
        } else if (nilai > 55) {
            System.out.println("Nilai anda C");
        } else {
            System.out.println("Nilai anda E");
        }

        System.out.println("=====================================");

        // Soal Kedua:
        System.out.println("Pengulangan dengan for");
        for(int i =2; i <= 20; i+=2){
            System.out.print(i + " ");
        }
        System.out.println("");
        System.out.println("-------------------------------------");
        
        System.out.println("Pengurangan dengan While");
        int j = 2;
        while(j <= 20){
            System.out.print(j + " ");
            j += 2;
        }
        System.out.println("");
        System.out.println("-------------------------------------");

        System.out.println("Pengungrangan dengan Do-While");
        int k = 2;
        do {
            System.out.print(k + " ");
            k += 2;
        } while(k <= 20);
        System.out.println("");

        System.out.println("=====================================");

        // Pertemuan 10 -- CONTENT (ABSTRACTION, ENCAPSULATION, INHERITANCE, POLYMORPHISM)
        Mahasiswa mhs = new Mahasiswa();

        mhs.setNama("Shaka Banuasta");
        mhs.setNim(2510117);
        mhs.setKelas("03SIFM002");

        System.out.println("");

        System.out.println("========== Data Mahasiswa ===========");
        System.out.println("Nama Lengkap   : " + mhs.getNama());
        System.out.println("NIM            : " + mhs.getNim());
        System.out.println("Kelas          : " + mhs.getKelas());
        System.out.println("=====================================");

        KetuaKelas ketua = new KetuaKelas();

        ketua.setJabatan("Ketua Kelas");
        ketua.setNama("Headzer Badger");
        ketua.setNim(25103007);
        ketua.setKelas("03SIFM002");
        ketua.setJabatan("Ketua Kelas");

        System.out.println("========= Data Ketua Kelas ==========");
        System.out.println("Nama Lengkap   : " + ketua.getNama());
        System.out.println("NIM            : " + ketua.getNim());
        System.out.println("Kelas          : " + ketua.getKelas());
        System.out.println("Jabatan        : " + ketua.getJabatan());
        System.out.println("=====================================");
    }
}
