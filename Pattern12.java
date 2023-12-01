package patterns;

public class Pattern12 {
    public static void main(String[] args) {
        pattern12(5);
    }
    static void pattern12(int n){
        for (int row = 1; row <= 2 * n; row++) {
            int totalSpaces = row > n ? 2 * n - row : row - 1 ;
            for (int spaces = 1; spaces <= totalSpaces; spaces++) {
                System.out.print(" ");
            }
            int totalCols = row > n ? row - n :  n - row + 1;
            for (int col = 1; col <= totalCols; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
