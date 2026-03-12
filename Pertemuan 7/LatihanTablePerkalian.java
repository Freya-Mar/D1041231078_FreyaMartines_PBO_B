public class LatihanTablePerkalian {

    public static void main(String[] args) {

        System.out.println("=== TABLE PERKALIAN 7 ===");
        int angka = 7;

        for(int i = 1; i<= 12; i++) {
            int hasil = angka * i;
            System.out.println(angka + " x " + i + " = " + hasil);
        }

    }
}