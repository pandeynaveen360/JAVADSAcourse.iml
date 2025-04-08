// Take a user input which is an integer. If the input value is even or odd.
// Input: 4
// Output: "Even"
//Input: 7
//Output: "Odd"

package PracticeQ;

import java.util.Scanner;

public class Problem_1 {
    public static void main(String[] args) {

    Scanner scn = new Scanner(System.in);
    int a =  scn.nextInt();

    if(a % 2 == 0){
        System.out.println("Even");
    }
    else{
        System.out.println("Odd");
    }
}
}