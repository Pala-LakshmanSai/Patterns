package patterns;

public class Pattern5 {
    public static void main(String[] args) {
        pattern5(5);
    }
    static void pattern5(int n){
        for (int row = 1; row <= 2 * n - 1; row++) {
            int totalCols = row > n ? n - (row - n) : row;
            for (int col = 1; col <= totalCols; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
