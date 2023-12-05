package patterns.Using_recursion;

public class Pattern4 {
    public static void main(String[] args) {
        pattern4(4, 0, 0);
    }
    public static void pattern4(int n, int r, int c) {
        if (r == n) {
            return;
        }
        if (c < n - 1 - r) {
            System.out.print(" ");
            pattern4(n, r, c + 1);
        }
        else if (c < r + n){
            System.out.print("*");
            pattern4(n, r, c + 1);
        }
        else{
            System.out.println();
            pattern4(n, r + 1, 0);
        }
    }
}
