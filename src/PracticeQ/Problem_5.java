package PracticeQ;

public class Problem_5 {
    public static void main(String[] args) {

        int n = 234;
        int rev = 0;
        int digit;
        while(n>0){
            for(int i =0 ; i <= n; i++){
                digit=n%10;
                rev = rev*10 + digit;
                n = n/10;
            }
            System.out.println(rev);
        }
    }
}
