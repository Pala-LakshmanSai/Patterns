package patterns;

public class Pattern13 {
    public static void main(String[] args) {
        pattern13(5);
    }
    static void pattern13(int n){
        for (int row = 1; row <= n; row++) {
            for (int sp1 = 1; sp1 <= n - row; sp1++) {
                System.out.print(" ");                
            }
            int totalStars1 = row == n ? 2*n - 1 : 1;
            for (int star1 = 1; star1 <= totalStars1; star1++) {
                System.out.print("*");
            }
            int totalSpaces2 = row == 1 || row == n ? 0 : 2 * row - 3;
            for (int sp2 = 1; sp2 <= totalSpaces2; sp2++) {
                System.out.print(" ");
            }
            int totalStars2 = row == 1 || row == n ? 0 : 1;
            for (int star2 = 1; star2 <= totalStars2; star2++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
