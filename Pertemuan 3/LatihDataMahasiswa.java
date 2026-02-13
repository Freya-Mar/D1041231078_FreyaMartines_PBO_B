

public class LatihDataMahasiswa {

    public static void main(String[] args) {
        long nim = 2301010001L; // menggunakan tipe data Long untuk memasukan Nim
        String nama = "Budi Santoso"; // menggunakan tipe data string untuk memasukan nama
        char kelas = 'A'; //tipe char untuk kelas
        boolean Aktif = true; //tipe boolean untuk satus aktif
        double ipk = 3.75; //tipe double untuk memasukan data ipk
        int sks = 72; //tipe int untuk memasukan total sks

        System.out.println("=== DATA MAHASISWA ===");
        System.out.println("NIM            : " + nim);
        System.out.println("Nama           : " + nama);
        System.out.println("Kelas          : " + kelas); 
        System.out.println("Status Aktif   : " + Aktif);
        System.out.println("IPK Semester   : " + ipk);
        System.out.println("Total SKS      : " + sks);
    }

    
}
