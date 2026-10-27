import java.util.Scanner;

public class perhitungannilai {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan nilai mahasiswa: ");
        double nilai = scanner.nextDouble();
        
        // a. Implementasi dengan if-else
        System.out.println("--- Menggunakan If-Else ---");
        if (nilai > 85) {
            System.out.println("Nilai: A");
        } else if (nilai >= 70 && nilai <= 85) {
            // Menyesuaikan logika agar tidak tumpang tindih dengan soal
            System.out.println("Nilai: B");
        } else if (nilai >= 55 && nilai < 70) {
            System.out.println("Nilai: C");
        } else if (nilai < 55) {
            System.out.println("Nilai: D");
        }

        // b. Ubah program menggunakan switch-case dengan pembulatan nilai ke puluhan
        System.out.println("\n--- Menggunakan Switch-Case (Pembulatan) ---");
        // Membulatkan nilai ke puluhan terdekat (misal 83 -> 80)
        int nilaiBulat = (int) (Math.round(nilai / 10.0) * 10);
        
        switch (nilaiBulat) {
            case 100:
            case 90:
                System.out.println("Nilai: A");
                System.out.println(nilaiBulat);
                break;
            case 80:
            case 70:
                System.out.println("Nilai: B");
                System.out.println(nilaiBulat);
                break;
            case 60:
            case 50:
                // Pada switch-case, batas 55-70 agak sulit direpresentasikan secara akurat 
                // jika hanya menggunakan pembulatan. Kita asumsikan 50 dan 60 masuk kategori ini.
                System.out.println("Nilai: C");
                System.out.println(nilaiBulat);
                break;
            default:
                if (nilai < 55) {
                    System.out.println("Nilai: D");
                    System.out.println(nilaiBulat);
                    System.out.println("Tidak Lulus");
                } else {
                    System.out.println("Nilai tidak valid");
                }
                break;
        }
        
        scanner.close();
    }
}
