import java.util.Scanner;

public class soal1b {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("======================================");
        System.out.print("Masukkan nilai : ");
        int nilai = sc.nextInt();
        int nilaiBulat = (nilai / 10) * 10;
        switch (nilaiBulat){
            case 100:
            case 90:
                if(nilai > 85){
                    System.out.println("Hasil   : A");
                }else{
                    System.out.println("Hasil   : B");
                }
                break;
            case 80:
            case 70:
                System.out.println("Hasil   : B");
                break;
            case 60:
                System.out.println("Hasil   : C");
                break;
            case 50:
                if (nilai > 55){
                    System.out.println("Hasil   : C");
                } else{
                    System.out.println("Hasil   : D");
                }
                break;
            default:
                System.out.println("Hasil   : D");
                break;
        }

    }
}
