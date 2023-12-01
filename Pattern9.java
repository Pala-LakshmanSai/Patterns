package patterns;

public class Pattern9 {
    public static void main(String[] args) {
        pattern9(5);
    }
    static void pattern9(int n){
        for (int row = 1; row <= n; row++) {
            for (int spaces = 1; spaces <= row - 1; spaces++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= 2 * n - 1 - 2 * (row - 1); col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
