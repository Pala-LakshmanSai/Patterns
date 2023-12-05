package patterns.Using_recursion;

public class Pattern2 {
    public static void main(String[] args) {
        pattern2(5, 0, 0);
    }
    public static void pattern2(int n, int r, int c) {
        if (r == n) {
            return;
        }
        if (c <= r) {
            System.out.print("*");
            pattern2(n, r, c + 1);
        }
        else {
            System.out.println();
            pattern2(n, r + 1, 0);
        }
    }
}
