package patterns.Using_recursion;

public class Pattern1 {
    public static void main(String[] args) {
    pattern1(5, 0, 0);
    }   
    public static void pattern1(int n, int r, int c) {
        if (r == n) {
            return;
        }
        if (c == n) {
            System.out.println();
            pattern1(n, r + 1, 0);
        }
        if (c < n) {
            System.out.print("*");
            pattern1(n, r, c + 1);
        }
    }
}
