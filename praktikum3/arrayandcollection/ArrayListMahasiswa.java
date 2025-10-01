package arrayandcollection;

import java.util.ArrayList;

public class ArrayListMahasiswa {
    public static void main(String[] args) {
        ArrayList<String> mahasiswa = new ArrayList<>();
        mahasiswa.add("Arshy");
        mahasiswa.add("Aisha");
        mahasiswa.add("Kayla");

        System.out.println("Daftar Mahasiswa (ArrayList):");
        for (String mhs : mahasiswa) {
            System.out.println(mhs);
        }
    }
}
