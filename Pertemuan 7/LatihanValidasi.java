public class LatihanValidasi {
    public static void main(String[] args) {
 
        int angka = 0;
        int nilai;

        System.out.println("=== VALIDASI NILAI UJIAN ===");

        do {
            angka++;
            if (angka == 1) {
                nilai = -10;
            } else if (angka == 2) { 
                nilai = 150;
            }
            else nilai = 85;

            System.out.println("\nPercobaan input: " + nilai);

            if (nilai < 0 || nilai > 100) {
                System.out.println("Error: Nilai harus antara 0-100!");
            } else {
                System.out.println("Nilai valid: " + nilai);
            }

        } while (nilai < 0 || nilai > 100);

    }
}