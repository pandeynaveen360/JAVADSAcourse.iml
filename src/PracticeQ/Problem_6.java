package PracticeQ;

public class Problem_6 {
    public static void main(String[] args) {

        int number = 5;
        int n1 = 0;
        int n2 = 1;

        int count = 1;

        while(count <= number+1 ) {
            System.out.println(n1);

            int sum  = n1 + n2;
            n1 = n2;
            n2 = sum;

            count = count + 1;
        }
    }
}
