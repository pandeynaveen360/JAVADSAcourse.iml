package ExpressionBlocks;

import java.util.Scanner;

public class InputOutput {

    public static void main(String[] args) {

        System.out.println("hello");
        //create an object of scanner class.
        Scanner input = new Scanner(System.in);

        System.out.print("enter an integer value:");
        //take input from user
        int number = input.nextInt();

        System.out.println("you entered " + number);

        //float myfloat = input.nextfloat();

        //double mydouble = input.nextDouble();

        //String mystring = input.nextString();

        //next() -> read a word from the user
        //nextline() -> read a line of text from user.

    }
}
