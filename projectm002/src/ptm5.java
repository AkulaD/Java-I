
import java.util.Scanner;

public class ptm5 {

    public static void main(String[] args){
        // Mahasiswa
        Scanner sc  = new Scanner(System.in);
        System.out.print("Input NIM         : ");
        String nim = sc.nextLine(); //String

        System.out.print("Nama Lengkap      : ");
        String namaLengkap = sc.nextLine(); //String

        System.out.print("Umur              : ");
        int umur = sc.nextInt(); //Integer
        
        System.out.print("IPK               : ");
        double ipk = sc.nextDouble(); //Double

        System.out.println("=============================================");
        System.out.println("NIM               : " + nim);
        System.out.println("Nama Lengkap      : " + namaLengkap);
        System.out.println("Umur              : " + umur + " Tahun");
        System.out.println("IPK               : " + ipk);
        System.out.println("=============================================");
    
    
        System.out.println();
        // Penggunaan If-Else
        System.out.println("********************************************");
        sc.nextLine();
        System.out.print("Password                : ");
        int password = sc.nextInt();
        System.out.print("Confirm Password        : ");
        int confpass = sc.nextInt();
        System.out.println("********************************************");

        System.out.println();
        sc.nextLine();
        if(password == confpass){
            System.out.println("=====================================");
            System.out.println("           Selamat Datang            ");
            System.out.println("=====================================");
            
            System.out.println();

            // Bagian Login
            System.out.println("*************************************");
            System.out.println("             Silahkan Login          ");
            System.out.print("Masukan Nim       : ");
            String loginNim = sc.nextLine();
            System.out.print("Masukan Password  : ");
            int loginPass = sc.nextInt();
            System.out.println("*************************************");

            sc.nextLine();
            // Bagian Validasi Login
            if(loginNim.equals(nim) && ( loginPass == password )){
                System.out.println("=====================================");
                System.out.println("           Selamat Datang            ");
                System.out.println("=====================================");
            }else{
                System.out.println("NIM dan Password salah!");
            }

        }else{
            System.out.println("Password Salah! Silahkan Ulangi");
        }
    }
}
