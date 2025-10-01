package exceptions;

public class TryCatchFinallyMahasiswa {
    public static void main(String[] args) {
        try {
            int hasil = 10 / 0; // ini bikin ArithmeticException
            System.out.println("Hasil: " + hasil);
        } catch (ArithmeticException e) {
            System.out.println("Terjadi error: " + e.getMessage());
        } finally {
            System.out.println("Blok finally tetap jalan meskipun error.");
        }
    }
}
