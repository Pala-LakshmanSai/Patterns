package patterns;

public class Pattern8 {
    public static void main(String[] args) {
        pattern8(5);
    }

    static void pattern8(int n ){
        for (int row = 1; row <= n; row++) {
            for (int spaces = 1; spaces <= n - (row - n); spaces++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= 2 * row - 1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
