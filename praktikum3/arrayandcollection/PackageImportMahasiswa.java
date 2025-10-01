package arrayandcollection;

import java.util.ArrayList;

public class PackageImportMahasiswa {
    public static void main(String[] args) {
        ArrayList<String> daftar = new ArrayList<>();
        daftar.add("kalisha");
        daftar.add("Ayasha");

        System.out.println("Contoh Package & Import Mahasiswa:");
        for (String nama : daftar) {
            System.out.println(nama);
        }
    }
}
