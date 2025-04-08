package IntroTopics;

public class TypeCasting {
    public static void main(String[] args) {

        // case 1

        byte by = 10;
        short sh = 10;
        int in = 10;
        long lo = 10;

        // by = sh;
        // by = in;
        // by = lo;

        sh = by;

        // sh = in;
        //sh = lo;

        in = by;
        in = sh;

        // in = lo;

        lo = by;
        lo = sh;
        lo = in;


        // case 2

        by = 100;
        for(byte b = 0; b<= 120; b++){

        }

        // case3

        float f= 5.6f;
        double d = 6.7;

        // f = d;
        d = f;

        // case4
        in = (int) f;

        byte b = (byte) 130;
        System.out.println(b);

        // case5

        char ch = 'a';

        in = ch;
        System.out.println(in);
        System.out.println(ch);
        System.out.println((int) ch);

        ch = 70;
        System.out.println(ch);
        System.out.println((int) 200);

        ch = (char)(ch + 1);
        System.out.println(ch);

        ch = 'a' + 1; // ch is 'b'
        ch = (char)('a' + ch); // a~
        System.out.println(ch);
    }
}
