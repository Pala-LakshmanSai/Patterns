package patterns.Using_recursion;

public class Pattern3 {
    public static void main(String[] args) {
        pattern3(5, 0, 0);
    }
    public static void pattern3(int n, int r, int c) {
        if (r == n) {
            return;
        }
        if (c < n - r) {
            System.out.print("*");
            pattern3(n, r, c + 1);
        }
        else{
            System.out.println();
            pattern3(n, r + 1, 0);
        }
    }
}
