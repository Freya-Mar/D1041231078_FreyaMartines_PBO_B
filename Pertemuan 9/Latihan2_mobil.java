class mobil {

    String merk;
    String warna;
    int tahun;
    int kecepatan = 0;

    public void tampilkanSpesifikasi() {
        System.out.println("=== SPESIFIKASI MOBIL ===");
        System.out.println("Merk : " + merk);
        System.out.println("Warna : " + warna);
        System.out.println("tahun : " + tahun);
        System.out.println();
    }

    public void percepat() {

        kecepatan = kecepatan + 20;
        System.out.println("Mobil dipercepat. . .");
    }

    public void tampilkanKecepatan() {
        System.out.println("Kecepatan saat ini: " + kecepatan + " km/jam");
    }
}

public class Latihan2_mobil {

    public static void main(String[] args) {
        
        mobil mobil1 = new mobil();

        mobil1.merk = "Toyota Avanza";
        mobil1.warna = "Silver";
        mobil1.tahun = 2020;

        mobil1.tampilkanSpesifikasi();

        mobil1.percepat();
        mobil1.percepat();

        mobil1.tampilkanKecepatan();
    }
}
