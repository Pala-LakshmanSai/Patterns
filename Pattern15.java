package patterns;

public class Pattern15 {
    public static void main(String[] args) {
        pattern15(5);
    }
    static void pattern15(int n) {
        for (int row = 1; row <= 2 * n - 1; row++) {
            int totalSpaces1 = row <= n ? n - row : row - n;
            for (int sp1 = 1; sp1 <= totalSpaces1; sp1++) {
                System.out.print(" ");                
            }
            for (int star1 = 1; star1 <= 1; star1++) {
                System.out.print("*");
            }
            int totalSpaces2 = row <= n ? 2 * row - 3 : 4 * n - 2 * row - 3 ;
            for (int sp2 = 1; sp2 <= totalSpaces2; sp2++) {
                System.out.print(" ");
            }
            int totalStars2 = row == 1 || row == 2 * n - 1 ? 0 : 1; 
            for (int star2 = 1; star2 <= totalStars2; star2++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
