package exceptions;

public class ThrowsMahasiswa{
    
    public static void cekNilai(int nilai) throws Exception {
        if (nilai < 0 || nilai > 100) {
            throw new Exception("Nilai harus 0 - 100!");
        }
        System.out.println("Nilai valid: " + nilai);
    }

    public static void main(String[] args) {
        try {
            cekNilai(120); 
        } catch (Exception e) {
            System.out.println("Exception tertangkap: " + e.getMessage());
        }
    }
}
