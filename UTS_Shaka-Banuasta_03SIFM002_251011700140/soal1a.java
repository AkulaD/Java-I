import java.util.Scanner;

public class soal1a {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("===============================");
        System.out.print("Masukan nilai   : ");
        int nilai = sc.nextInt();
        System.out.println("===============================");
        System.out.println("Nilai yang di input : " + nilai);

        if (nilai > 85){
            System.out.println("Nilai anda A");
        }else if (nilai > 70){
            System.out.println("Nilai anda B");
        }else if (nilai > 55){
            System.out.println("Nilai anda C");
        }else if (nilai < 55){
            System.out.println("Nilai anda D");
        }

        System.out.println("===============================");
    }
}
