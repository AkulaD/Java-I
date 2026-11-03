import java.util.Scanner;

public class soal1a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        double nilai = input.nextDouble();

        if (nilai > 85) {
            System.out.println("Nilai: A");
        } else if (nilai >= 70) {
            System.out.println("Nilai: B");
        } else if (nilai > 55) {
            System.out.println("Nilai: C");
        } else {
            System.out.println("Nilai: D");
        }
        
        input.close();
    }
}