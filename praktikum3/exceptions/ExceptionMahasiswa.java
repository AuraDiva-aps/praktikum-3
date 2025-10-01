package exceptions;

public class ExceptionMahasiswa {
    public static void cekNilai(int nilai) throws InvalidNilaiException {
        if (nilai < 0 || nilai > 100) {
            throw new InvalidNilaiException("Nilai mahasiswa harus 0 - 100. Input: " + nilai);
        } else {
            System.out.println("Nilai valid: " + nilai);
        }
    }

    public static void main(String[] args) {
        try {
            cekNilai(120); 
        } catch (InvalidNilaiException e) {
            System.out.println("Terjadi Exception: " + e.getMessage());
        } finally {
            System.out.println("Blok finally selalu dijalankan (cleanup).");
        }
    }
}
