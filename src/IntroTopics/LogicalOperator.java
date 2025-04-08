package IntroTopics;

public class LogicalOperator {
    public static void main(String[] args) {


        //1. && (Logical AND)  exp1 && exp2
        System.out.println((5 > 3) && (8 > 5));
        System.out.println((5 < 3) && (8 > 5));

        //2. || (Logical OR)  exp1 || exp2
        System.out.println((5 < 3) || (8 > 5)); //true
        System.out.println((5 > 3) || (8 < 5)); //true
        System.out.println((5 < 3) || (8 < 5)); //false

        //3. ! (Logical NOT) !exp
        System.out.println(!(5 == 3));
        System.out.println(!(5 > 3));

    }
}
