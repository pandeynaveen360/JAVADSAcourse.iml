package Arrays;

public class TwoDArrayDemo {
    public static void main(String[] args) {

        int[][] a = new int[3][4];

        System.out.println(a);
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);

        System.out.println(a.length); // rows
        System.out.println(a[0].length); // cols

        // access
        System.out.println(a[1][2]);

        //set
        a[2][3] = 300;

        System.out.println(a[2][3]);

        int[][] a1 = {
                {1, 2, 7},
                {3, 4, 8},
                {5, 6, 9}
        };
        for(int i = 0; i < a1.length; i++) {
            for(int j = 0; j <a1[0].length; j++) {
                System.out.print(a1[i][j] + " ");
            }
            System.out.println();
        }
        for (int[] val: a1) {
            for(int temp: val) {
                System.out.print(temp + " ");
            }
            System.out.println();
        }
    }
}
