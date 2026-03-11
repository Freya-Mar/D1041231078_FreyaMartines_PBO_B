public class LatihanDiskon {

    public static void main(String[] args) {

        double totalBelanja = 750000.0;
        double hemat;

        if (totalBelanja < 100000) {
            hemat = 0;
        } else if (totalBelanja < 500000) {
            hemat = totalBelanja * 0.05;
        } else if (totalBelanja < 1000000) {
            hemat = totalBelanja * 0.10;
        } else {
            hemat = totalBelanja * 0.15;
        }

        double hargaAkhir = totalBelanja - hemat;

        System.out.println("=== KALKULATOR DISKON ===");
        System.out.println("Total Belanja: Rp " + totalBelanja);
        System.out.println("Diskon (10%) : " + hemat);
        System.out.println("Harga Akhir: Rp " + hargaAkhir);
        System.out.println("Anda hemat: Rp " + hemat);
    }
}

    
