public class LatihPerhitungan_Latihan2 {
    
    public static void main(String[] args) {

        int saldo = 1000000; // untuk menampilkan variable saldo awal
        int setoran = 500000; // untuk variable setoran
        int penarikan = 250000; // untuk variable penarikan 

        System.out.println("=== SIMULASI TRANSAKSI BANK ==="); 
        System.out.println("Saldo awal            : " + saldo); //untuk menampilkan saldo awalnya
        System.out.println("Setoran               : " + setoran); // untuk menampilkan setoran
        System.out.println("Saldo setelah setoran : " + (saldo + setoran)); // untuk menambahkan saldo awal dan setoran agak mendapatkan jumlahnya
        System.out.println("Penarikan             : " + penarikan);// untuk menampilkan penarikan
        System.out.println("Saldo Akhir           : " + (saldo + setoran - penarikan)); //untuk mendapatkan saldo akhir, Saldo awal harus ditambah dengan setoran
                                                                                        // kemudian dikuraing dengan penarikan agar mendaptkan hasil saldo Akhir
    }
}
