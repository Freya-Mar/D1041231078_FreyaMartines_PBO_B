public class LatihanProduk_Latihan1 {
    public static void main(String[] args ) {

        String NamaProduk = "Laptop Asus";
        int HargaSatuan = 7000000;
        int JumlahStok = 15;
        boolean isReady = true;
        double PAJAK = 0.11;


        System.out.println("=== INFORMASI PRODUK === ");
        System.out.println("Nama Produk : " + NamaProduk);
        System.out.println("Harga Satuan : " + HargaSatuan);
        System.out.println("Jumlah Stok : " + JumlahStok);
        System.out.println("Status Tersedia : " + isReady);
        System.out.println("---");
        System.out.println("Total Nilai Stok : Rp " + (HargaSatuan * JumlahStok));
        System.out.println("Pajak (11%) : RP " + (int)((HargaSatuan * JumlahStok) * PAJAK));

    }
    
}
