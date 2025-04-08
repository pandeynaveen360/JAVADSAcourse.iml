package IntroTopics;

public class IfElse {
    public static void main(String[] args) {

        boolean primesubs = true;

        //if else
        if(primesubs == true) {
            System.out.println("Welcome to the prime subscription");
        }
        else {
            System.out.println("Please become a member of amazon prime now.");
        }

        int num = 10;


        //if
        if(num<0) {
            System.out.println("It is a negative number");
        }
            System.out.println("Now you are the outside the if block ");

        //if else if..else

        //'n' -> no subs
        //'s' -> super
        //'p' -> premium

        int hotstarsubs = 1;

        if(hotstarsubs == 0){
            System.out.println("now is a good time to get a hotstar subscription");
        }else if(hotstarsubs ==1){
            System.out.println("why dont you upgrade to primium subs");
        }else if(hotstarsubs == 2){
            System.out.println("welcome to hotstar premium");
        }else{
            System.out.println("this looks like an invalide input");
        }

        //Nested if else

        String movie = "Line of Duty";

        boolean primsubs = true;
        boolean acorn = false;
        boolean amc = true;

        if(primesubs) {
            if (acorn || amc) {
                System.out.println("Yes, you can watch it.Enjoy");
            } else {
                System.out.println("We recommend buying either acorn or amc to enjoy this movie");
            }
        }else{
                System.out.println("Cannot watch the movie. Why dont you take prime subs");
        }
    }
}
