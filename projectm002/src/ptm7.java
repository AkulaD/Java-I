import java.util.Scanner; // Import Scanner nya

public class ptm7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Nama dan Password
        String user = "Shaka";
        int password = 1234;

        System.out.println("=====================================");
        System.out.println("========== Silahkan Login ===========");
        System.out.print("Masukan User      : ");
        String loginUser = input.nextLine();
        System.out.print("Masukan Password  : ");
        int loginPassword = input.nextInt();
        System.out.println("=====================================");

        if(loginUser.equals(user) && (loginPassword == password)){
            System.out.println("-------------------------------------");
            System.out.println("=  Selamat Datang di Resto SIFM002  =");
            System.out.println("-------------------------------------");
            System.out.println("========== List Menu Resto ==========");
            System.out.println("(1). Nasi Goreng");
            System.out.println("(2). Nasi Kucing");
            System.out.println("(3). Nasi Kuning");
            System.out.println("(4). Nasi Uduk");
            System.out.println("(5). Nasi Padang");
            System.out.println("-------------------------------------");
            System.out.print("Pilih Menu Resto : ");
            int pilihan = input.nextInt();
            System.out.print("Jumlah Pesanan : ");
            int jumlah = input.nextInt();

            String menu = "";
            double harga = 0;


            switch (pilihan) {
                case 1:
                    menu = "Nasi Goreng";
                    harga = 12500;
                    // System.out.println("*************************************");
                    // System.out.println("Nasi Goreng");
                    // System.out.println("Harga : Rp 12.500");
                    // System.out.println("-------------------------------------");
                    // System.out.println("Total Harga : Rp " + jumlah * 12500);
                    // System.out.println("*************************************");
                    break;
                case 2:
                    menu = "Nasi Kucing";
                    harga = 5000;
                    // System.out.println("*************************************");
                    // System.out.println("Nasi Kucing");
                    // System.out.println("Harga : Rp 5.000");
                    // System.out.println("-------------------------------------");
                    // System.out.println("Total Harga : Rp " + (jumlah * 5000));
                    // System.out.println("*************************************");
                    break;
                case 3:
                    menu = "Nasi Kuning";
                    harga = 15000;
                    // System.out.println("*************************************");
                    // System.out.println("Nasi Kuning");
                    // System.out.println("Harga : Rp 15.000");
                    // System.out.println("-------------------------------------");
                    // System.out.println("Total Harga : Rp " + (jumlah * 15000));
                    // System.out.println("*************************************");
                    break;
                case 4:
                    menu = "Nasi Uduk";
                    harga = 13000;
                    // System.out.println("*************************************");
                    // System.out.println("Nasi Uduk");
                    // System.out.println("Harga : Rp 13.000");
                    // System.out.println("-------------------------------------");
                    // System.out.println("Total Harga : Rp " + (jumlah * 13000));
                    // System.out.println("*************************************");
                    break;
                case 5:
                    menu = "Nasi Padang";
                    harga = 14000;
                    // System.out.println("*************************************");
                    // System.out.println("Nasi Padang");
                    // System.out.println("Harga : Rp 14.000");
                    // System.out.println("-------------------------------------");
                    // System.out.println("Total Harga : Rp " + (jumlah * 14000));
                    break;

                default:
                    System.out.println("Menu Tidak Tersedia");
                    break;

            }

                double total = harga * jumlah;
                System.out.println("=====================================");
                System.out.println("----------- LIST PESANAN ------------");
                System.out.println("Pesanan     : " + menu);
                System.out.println("Harga       : Rp " + harga);
                System.out.println("Jumlah      : " + jumlah);
                System.out.println("-------------------------------------");
                System.out.println("Total Harga : Rp " + total);
                System.out.println("=====================================");


            }else{
            System.out.println("-------------------------------------");
            System.out.println("============ Login Gagal ============");
            System.out.println("-------------------------------------");
        }
    }
}


// Nama : Shaka Banuasta
