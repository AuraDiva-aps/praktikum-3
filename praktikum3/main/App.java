package main;

import arrayandcollection.ArrayListMahasiswa;
import arrayandcollection.HashMapMahasiswa;
import arrayandcollection.PackageImportMahasiswa;
import exceptions.ExceptionMahasiswa;

public class App {
    public static void main(String[] args) {
        System.out.println("=== Praktikum PBO Lanjutan ===");

        System.out.println("\n--- ArrayList Mahasiswa ---");
        ArrayListMahasiswa.main(null);

        System.out.println("\n--- Package Import Mahasiswa ---");
        PackageImportMahasiswa.main(null);

        System.out.println("\n--- Exception Mahasiswa ---");
        ExceptionMahasiswa.main(null);

        System.out.println("\n--- HashMap Mahasiswa ---");
        HashMapMahasiswa.main(null);

    }
}

