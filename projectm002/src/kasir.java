import java.util.Scanner;

public class kasir {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan Nama Barang   : ");
        String namaBarang = sc.nextLine();
        System.out.print("Masukan Harga Barang  : ");
        int hargaBarang = sc.nextInt();
        System.out.print("Jumlah Barang Dibeli  : ");
        int totalBarang = sc.nextInt();

        // Program
        int totalHarga = hargaBarang * totalBarang;
        // if(totalHarga > 500000){
        //     int diskon = totalHarga * 10 / 100;
        //     System.out.println("=======================================");
        //     System.out.println("Nama Barang : " + namaBarang);
        //     System.out.println("Harga Barang: Rp." + hargaBarang);
        //     System.out.println("Total Barang: " + totalBarang);
        //     System.out.println("Total Harga : Rp." + totalHarga);
        //     System.out.println("Diskon      : Rp." + diskon);
        //     System.out.println("Total Bayar : Rp." + (totalHarga - diskon));
        //     System.out.println("=======================================");
        // }else if(totalHarga > 250000 && totalHarga < 500000){
        //     int diskon = totalHarga * 5 /100;
        //     System.out.println("=======================================");
        //     System.out.println("Nama Barang : " + namaBarang);
        //     System.out.println("Harga Barang: Rp." + hargaBarang);
        //     System.out.println("Total Barang: " + totalBarang);
        //     System.out.println("Total Harga : Rp." + totalHarga);
        //     System.out.println("Diskon      : Rp." + diskon);
        //     System.out.println("Total Bayar : Rp." + (totalHarga - diskon));
        //     System.out.println("=======================================");
        // }else{
        //     System.out.println("=======================================");
        //     System.out.println("Nama Barang : " + namaBarang);
        //     System.out.println("Harga Barang: Rp." + hargaBarang);
        //     System.out.println("Total Barang: " + totalBarang);
        //     System.out.println("Diskon      : Rp." + diskon);
        //     System.out.println("Total Bayar : Rp." + (totalHarga - diskon));
        //     System.out.println("=======================================");
        // }

        // IF cuma 1 doang
        int diskon = 0;
        
        // Logika Hitung Diskon
        if (totalHarga > 500000) {
            diskon = totalHarga * 10 / 100;
        } else if (totalHarga >= 250000) {
            diskon = totalHarga * 5 / 100;
        } else {
            diskon = 0;
        }
        
        // Output Struk Pembayaran
        System.out.println("=======================================");
        System.out.println("Detail Barang");
        System.out.println("Nama Barang   : " + namaBarang);
        System.out.println("Harga Barang  : Rp." + hargaBarang);
        System.out.println("Total Barang  : " + totalBarang);
        System.out.println("");
        System.out.println("---------------------------------------");
        System.out.println("Total Harga   : Rp." + totalHarga);
        System.out.println("Diskon        : Rp." + diskon);
        System.out.println("Total Bayar   : Rp." + (totalHarga - diskon));
        System.out.println("=======================================");
        
        sc.close();
    } 
}