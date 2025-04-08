package PatternProblem;

public class Pattern_2 {
    public static void main(String[] args) {

        int n = 5;  // odd
        int trows = n;

        int stars = 1;

        for (int row = 1; row <= trows; row++) {

            //work
            for (int cst = 1; cst <= stars; cst++) {
                System.out.print("*");
            }
            // prep next row
            System.out.println();
            if (row <= trows / 2) {
                stars++;
            } else {
                stars--;
            }
        }
    }
}
