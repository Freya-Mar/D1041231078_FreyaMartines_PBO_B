class persegi {

    int sisi;
    int luas;
    int keliling;

    public void tampilkanHasil() {

        System.out.println("=== PERSEGI ===");
        System.out.println("Sisi: " + sisi + "cm");
        System.out.println();
    }
    
    public void hitungLuas() {
        luas = sisi * sisi;
        System.out.println("Luas : " + luas + "cm");
        System.out.println();
    }

    public void hitungKeliling() {
        keliling = 4 * sisi;
        System.out.println("Keliling : " + keliling + "cm");
        System.out.println();
    }
}

public class Latihan3_persegi {
     public static void main(String[] args) {
        
        persegi persegi1 = new persegi();

        persegi1. sisi = 5;

        persegi1.tampilkanHasil();

        persegi1.hitungLuas();

        persegi1.hitungKeliling();
    }
}