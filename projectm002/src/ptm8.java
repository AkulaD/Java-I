import java.util.Scanner;

public class ptm8 {
    public static void main(String[] args){
        // // For Loop -- Contoh --
        // for(int i = 1; i <= 10; i++){
        //     System.out.println("Perulangan ke-" + i);
        // }

        // System.out.println();

        // // Latihan -- Bagian Praktek --
        // for(int a = 0; a <=5; a++){
        //     System.out.println("Angka ke-" + a);
        // }

        // for(int a = 0; a <=5; a++){
        //     String bintang = "*";
        //     System.out.println();
        //     for(int b = 5; b > a; b--){
        //         System.out.print(bintang);
        //     }
        // }

        // System.out.println("*");
        // System.out.println("**");
        // System.out.println("***");
        // System.out.println("****");
        // System.out.println("*****");

        Scanner arr = new Scanner(System.in);

        System.out.println("-----------PESANAN------------");
        System.out.print("Jumlah Pesanan    : ");
        int jumlahPesanan = arr.nextInt();
        arr.nextLine();     // Jangan Lupa Pakai ini untuk mencegah error di Line 43 & 44
        System.out.println("------------------------------");
        
        // Membuat Array
        String[] makanan = new String[jumlahPesanan];
        int[] harga = new int[jumlahPesanan];
        
        // Penggunaan For Loop
        for(int b = 0; b < jumlahPesanan; b++){
            System.out.println("Pesanan Ke-" + (b + 1));
            System.out.print("Menu Makanan  : ");
            makanan[b] = arr.nextLine(); //Pake Line 36
            // Input Harga
            System.out.print("Harga         : ");
            harga[b] = arr.nextInt();
            arr.nextLine(); //Pakai nextLine biar gak error
        }
        
        // Disini ada Perincian pesanan
        System.out.println("====== Rincian Pesanan =======");
        for(int b=0; b < jumlahPesanan; b++){
            // Tempat List nya
            System.out.println("Pesanan Ke-" + (b + 1) + ": " + makanan[b] + " (Rp." + harga[b] + ")");
        }

        // Disini buat Total
        int total = 0;
        for(int b=0; b < jumlahPesanan; b++){
            total = total + harga[b]; // Hitung Total
        }

        // Total Dsini
        System.out.println("------------------------------");
        System.out.println("Total:");
        System.out.println("Rp. " + total);
        System.out.println("==============================");

    }
}
