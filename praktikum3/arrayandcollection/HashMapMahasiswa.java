package arrayandcollection;

import java.util.HashMap;

public class HashMapMahasiswa {
    public static void main(String[] args) {
        // Membuat HashMap dengan key = NIM, value = Nama
        HashMap<String, String> mahasiswa = new HashMap<>();

        // Menambahkan data mahasiswa
        mahasiswa.put("101", "Arshy");
        mahasiswa.put("102", "Aisha");
        mahasiswa.put("103", "Kayla");

        // Menampilkan semua data
        System.out.println("Daftar Mahasiswa:");
        for (String nim : mahasiswa.keySet()) {
            System.out.println("NIM: " + nim + " | Nama: " + mahasiswa.get(nim));
        }

        // Mengakses data berdasarkan key
        System.out.println("\nMahasiswa dengan NIM 102: " + mahasiswa.get("102"));

        // Menghapus data
        mahasiswa.remove("103");
        System.out.println("\nSetelah Kayla dihapus:");
        for (String nim : mahasiswa.keySet()) {
            System.out.println("NIM: " + nim + " | Nama: " + mahasiswa.get(nim));
        }
    }
}
