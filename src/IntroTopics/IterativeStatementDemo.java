package IntroTopics;

public class IterativeStatementDemo {
    public static void main(String[] args) {

        //int n = 10;

        //for (int i = 1; i <= n; i++) {
        // System.out.println("Hello NaveenPandey" + i);
        // print sum of all natural number

        // (1-4) => 1+2+3+4 => 10

        int number = 10;
        int sum = 0;

        for (int i = 1; i <= number; i++) {
             sum = sum + i;
        }
        System.out.println(sum);
    }

    }