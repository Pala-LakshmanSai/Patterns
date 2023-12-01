package patterns;

public class Pattern16 {
    public static void main(String[] args) {
        pattern16(5);
    }
    static void pattern16(int n) {
        for (int row = 1; row <= n; row++) {
            for (int sp1 = 1; sp1 <= n - row; sp1++) {
                System.out.print(" ");
            }
            for (int cols = 1; cols <= row - 1; cols++) {
                System.out.print(cols + " ");
            }
            System.out.println();
        }
    }
}
