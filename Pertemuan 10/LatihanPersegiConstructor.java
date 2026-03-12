class Persegi {

    int sisi;
    int luas;
    int keliling;

    Persegi(int sisi) {

        if (sisi <= 0) {
            System.out.println("ERROR: sisi tidak boleh <= 0. Diset ie default (1).");
            this.sisi = 1;
        } else {
            this.sisi = sisi;
        }

        this.luas = this.sisi * this.sisi;
        this.keliling = 4 * this.sisi;
    }

    public void tampilkanHasil() {
        System.out.println("=== PERSEGI ===");
        System.out.println("Sisi    : " + sisi + "cm");
        System.out.println("Luas    : " + luas + "cm");
        System.out.println("Keliling: " + keliling + "cm");
        System.out.println();
    }
}

public class LatihanPersegiConstructor {
    public static void main(String[] args) {

        Persegi persegi1 = new Persegi(5);
        persegi1.tampilkanHasil();

        Persegi persegi2 = new Persegi(0);
        persegi2.tampilkanHasil();

    }
}
