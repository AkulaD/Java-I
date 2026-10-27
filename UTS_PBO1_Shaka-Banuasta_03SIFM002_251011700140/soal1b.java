import java.util.Scanner;

public class soal1b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        int nilai = input.nextInt();

        int nilaiBulat = (nilai / 10) * 10;

        switch (nilaiBulat) {
            case 100:
            case 90:
                if (nilai > 85) {
                    System.out.println("Nilai: A");
                } else {
                    System.out.println("Nilai: B");
                }
                break;
            case 80:
            case 70:
                System.out.println("Nilai: B");
                break;
            case 60:
                System.out.println("Nilai: C");
                break;
            case 50:
                if (nilai > 55) {
                    System.out.println("Nilai: C");
                } else {
                    System.out.println("Nilai: D");
                }
                break;
            default:
                System.out.println("Nilai: D");
                break;
        }

        input.close();
    }
}