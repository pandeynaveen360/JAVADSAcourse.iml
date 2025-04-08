package IntroTopics;

public class DataTypeDemo {

    public static void main(String[] args) {

        boolean flag = true;
        System.out.println(flag);

        byte range;
        range = 127;  // -128 to 127
        System.out.println(range);

        short temperature;
        temperature = -200; //-32768 to 32767
        System.out.println(temperature);

        int ranges = - 425000; // -2^31 to 2^31 - 1
        System.out.println(ranges);

        long ranges1 = -234566543; // -2^63 to 2^63 - 1
        System.out.println(ranges1);

        double number = -87.6; // precision 64-bit floating point digit
        System.out.println(number);

        float values = -2.4f;
        System.out.println(values);

        char names = '\u0051';
        System.out.println(names);

        String letter = "Naveen pandey";
        System.out.println(letter);
    }
}
