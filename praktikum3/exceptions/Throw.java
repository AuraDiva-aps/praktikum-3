package exceptions;

public class Throw
 {
    public static void main(String[] args) {
        int umur = -5;
        try {
            if (umur < 0) {
                throw new IllegalArgumentException("Umur tidak boleh negatif!");
            }
            System.out.println("Umur: " + umur);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception dilempar manual: " + e.getMessage());
        }
    }
}
