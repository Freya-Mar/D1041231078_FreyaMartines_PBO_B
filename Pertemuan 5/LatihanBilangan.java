public class LatihanBilangan {
    public static void main(String[] args) {
        int number = -7;

        System.out.println("=== PEMERIKSAAN BILANGAN ===");
        System.out.println("Bilangan : " + number);

        if(number > 0) {
            System.out.println("Jenis : Bilangan positive");
        } else if (number < 0) {
            System.out.println("Jenis : Bilangan negatif");
        } else {
            System.out.println("Jenis: Bilangan nol");
        }

        if (number % 2 == 0) {
            System.out.println("Tipe: Genap");
        } else {
            System.out.println("Tipe: Ganjil");
        }
    }
}
        
