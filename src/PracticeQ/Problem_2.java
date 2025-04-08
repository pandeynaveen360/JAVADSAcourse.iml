// Given the 3 angles of a triangle. You need to check whether a valid triangle can be formed from those 3 angles.
//Input: 60 30 90
//Output:"valid triangle
//Input: 90 20 30
//Output: "invalid triangle

package PracticeQ;

import java.util.Scanner;

public class Problem_2 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        int angle;

        angle = a+b+c;
        if(angle == 180 && a > 0 && b> 0 && c > 0 ){
            System.out.println("valid triangle");
        }
        else{
            System.out.println("invalid triangle");
        }
    }
}
