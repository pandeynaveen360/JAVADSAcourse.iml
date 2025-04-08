// Given an year, print whether that year is a leap year or not.
// Input: 2016
//Output:"leap year"
//Input: 2022
//Output: "Not a leap year"

package PracticeQ;

import java.util.Scanner;

public class Problem_3 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int year = scn.nextInt();
// A year is considered a leap year
// 1.If year is exactly divisible by 4 and not divisible by 100,or
// 2.If year is divisible by 400, then it is a leap year
        if( ( (year % 4 == 0) && (year % 100 != 0) ) || (year % 400 == 0 ) ) {
            System.out.println("leap year");
        }
        else{
            System.out.println("not a leap year");
        }
    }
}
