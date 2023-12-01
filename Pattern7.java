package patterns;

public class Pattern7 {
    public static void main(String[] args) {
        pattern7(5);
    }
    static void pattern7(int n){
        for (int row = 1; row <= n; row++) {
            for (int spaces = 1; spaces <= row - 1; spaces++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= n - (row - 1); col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
