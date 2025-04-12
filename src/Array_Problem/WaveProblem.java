package Array_Problem;

public class WaveProblem {
    public static void main(String[] args) {

        int[][] a1 = {
                {1, 2, 7, 10},
                {3, 4, 8, 11},
                {5, 6, 9, 12}
        };
        waveDisplay(a1);
    }

    private static void waveDisplay(int[][] arr) {

        for (int c = 0; c < arr[0].length; c++) {
            if (c % 2 == 0) {
                for (int r = 0; r < arr.length; r++) {
                    System.out.print(arr[r][c] + " ");
                }
            } else {

                for (int r = arr.length - 1; r >= 0; r--) {
                    System.out.print(arr[r][c] + " ");
                }
            }
        }
    }
}

