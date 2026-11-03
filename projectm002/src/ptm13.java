class Rekening {
    protected String nama;
    protected double saldo;
    
    public Rekening(String nama, double saldo){
        this.nama = nama;
        this.saldo = saldo;
    }

    public void tampilkanInfo(){
        System.out.println("=============== Rekening ===============");
        System.out.println("=  Nama     : " + this.nama);
        System.out.println("=  Saldo    : " + this.saldo);
        System.out.println("========================================");
    }
}

class RekeningTabungan extends Rekening{
    public RekeningTabungan(String nama, double saldo){
        super(nama, saldo);
    }

    @Override
    public void tampilkanInfo(){
        System.out.println("=============== Rekening Tabungan ===============");
        System.out.println("=  Nama     : " + this.nama);
        System.out.println("=  Saldo    : " + this.saldo);
        System.out.println("=================================================");
    }
}

public class ptm13 {
    public static void main(String[] args){
        Rekening r1 = new RekeningTabungan("Shaka", 1000000);
    
        r1.tampilkanInfo();
    }
}
