import java.util.Scanner;

public class pertemuan9b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai awal : ");
        int nilaiAwal = scanner.nextInt();

        System.out.print("Masukkan nilai akhir : ");
        int nilaiAkhir = scanner.nextInt();

        System.out.println("Hasil deret:");
        for (int i = nilaiAwal; i <= nilaiAkhir; i += 5) {
            System.out.print(i + " ");
        }
        System.out.println();

        scanner.close();
    }
}