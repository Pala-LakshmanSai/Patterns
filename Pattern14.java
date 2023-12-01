package patterns;

public class Pattern14 {
    public static void main(String[] args) {
        pattern14(5);
    }

    static void pattern14(int n){
        for (int row = 1; row <= n; row++) {
            for (int sp1 = 1; sp1 <= row - 1; sp1++) {
                System.out.print(" ");                
            }
            int totalStars1 = row == 1 ? 2 * n - 1 : 1;
            for (int star1 = 1; star1 <= totalStars1; star1++) {
                System.out.print("*");
            }
            int totalSpaces2 = row == 1 || row == n ? 0 : 2 * n - 2 * row - 1;
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
