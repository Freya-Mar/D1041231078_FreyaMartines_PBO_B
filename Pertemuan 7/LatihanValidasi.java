public class LatihanValidasi {
    public static void main(String[] args) {

        int[] percobaan = {-10, 150, 85}; 
        int i = 0;
        int nilai;

        System.out.println("=== VALIDASI NILAI UJIAN ===");

        do {
            nilai = percobaan[i];
            System.out.println("\nPercobaan input: " + nilai);

            if (nilai < 0 || nilai > 100) {
                System.out.println("Error: Nilai harus antara 0-100!");
            } else {
                System.out.println("Nilai valid: " + nilai);
            }

            i++;

        } while (nilai < 0 || nilai > 100);
    }
}