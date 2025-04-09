package Problem;

public class ArmstrongNumber {

    // A positive integer is called an armstrong number if
    // abc = a^n + b^n + c^n

    //153 -> 1^3 + 5^3 + 3^3

    // Given an input number, true/false, if is an armstrong number or not.
    // 153 -> true
    // 578 -> false

    public static void main(String[] args) {
        System.out.println(isArmstrong(153));
    }

    public static boolean isArmstrong(int n) {


        int nod = countDigits(n);
        int on = n;
        int sum = 0;

        while (n > 0) {

            int rem = n % 10;
            sum += Math.pow(rem, nod);
            n = n / 10;
        }

        // if(sum == on) {
        //        return true;
        //}else{
        //        return false;

        return sum == on;
    }

    public static int countDigits(int n) {
        int nod = 0;
        while(n>0) {
            n = n/10;
            nod++;
        }

        return nod;
    }
}

