public class App {
    public static void main(String[] args) throws Exception {
        int umur = 17;
        // System.out.print(umur);
        System.out.print(umur);
        System.out.print("Ini tidak pakai LN");
        System.out.print("Ini baris ke 2");
        
        System.out.println();
        // System.out.println(umur);
        System.out.println(umur);
        System.out.println("Ini pakai LN");
        System.out.println("Ini baris ke 2");
    
        // Variabel
        String namaLengkap = "Shaka Banuasta";
        double tinggiBadan = 176.0;
        int beratBadan = 70;
        String kelas = "03SIFM002";

        System.out.println("==================================");
        System.out.println("Nama Lengkap   : " + namaLengkap);
        System.out.println("Tinggi Badan   : " + tinggiBadan);
        System.out.println("Berat Badan    : " + beratBadan);
        System.out.println("Kelas          : " + kelas);
        System.out.println("==================================");

        System.out.println();

        // Variabel 2 ( Aritmatika )
        int x = 10, y = 3; // Variabel boleh sama
        System.out.println("==================================");
        System.out.println("Perjumlahan     : " + (x + y)); // Perjumlahan
        System.out.println("Pengurangan     : " + (x - y));
        System.out.println("Perkalian       : " + (x * y));
        System.out.println("Pembagian       : " + (x % y));
        System.out.println("==================================");

        System.out.println();
        // Aritmatika 2
        System.out.println("==================================");
        System.out.println("Tambah    : " + (x+=5));
        System.out.println("Kurang    : " + (x-=3));
        System.out.println("Kali      : " + (x*=2));
        System.out.println("Bagi      : " + (x/=4));
        System.out.println("Modulus   : " + (x%=6));
        System.out.println("==================================");

        System.out.println();
        // Logika ++
        int m = 3;
        int o = 8 - m++;
        int p = 8 - ++m;
        System.out.println("==================================");
        System.out.println("o       : " + o);
        System.out.println("p       : " + p);
        System.out.println("==================================");
    }
}
