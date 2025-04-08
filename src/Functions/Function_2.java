package Functions;

public class Function_2 {
    public static void main(String[] args) {

        int res = addnumbers(25, 10);
        System.out.println(res);
        int res2 = addnumbers();
        System.out.println(res2);

        for(int i =1; i<= 5; i++) {

            int result = getsquare(i);
            System.out.println("Square of" + i + " is: " + result);


        }

    }
    public static int getsquare(int x) {
        return x * x;
    }
     public static int addnumbers(int val1 , int val2) {
        int sum = val1 + val2;
        return sum;
     }
     public static int addnumbers() {
        int a = 5;
        int b = 10;
        int sum  =  a + b;
        return sum;
     }
}
