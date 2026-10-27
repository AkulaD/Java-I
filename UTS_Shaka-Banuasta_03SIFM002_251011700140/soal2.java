public class soal2 {
    public static void main(String[] args) {
        System.out.println("=========================================================");
        System.out.println("Menggunakan FOR:");
        for (int i = 2; i <= 20; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("=========================================================");
        System.out.println("Menggunakan WHILE:");
        int j = 2;
        while (j <= 20) {
            System.out.print(j + " ");
            j++;
        }
        System.out.println();

        System.out.println("=========================================================");
        System.out.println("Menggunakan DO-WHILE:");
        int k = 2;
        do {
            System.out.print(k + " ");
            k++;
        } while (k <= 20);
        System.out.println();
    }
}
