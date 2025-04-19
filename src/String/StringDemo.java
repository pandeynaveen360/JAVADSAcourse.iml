package String;

public class StringDemo {
    public static void main(String[] args) {
        String first = "Java";
        String second = "python";
        String third = "Java";

        //print
        System.out.println(first);
        System.out.println(third);

        //String stringname = new String("string_value");
        String str = new String("algocamp");

        System.out.println(str);

        // string operations
        String greet = "hello world";
        System.out.println("String: " + greet);
        System.out.println(greet.length());

        // join two strings
        String joinString = first.concat(second);
        System.out.println(joinString);

        //comparing two strings
        boolean res1 = first.equals(second);
        System.out.println(res1);

        boolean res2 = first.equals(third);
        System.out.println(res2);

        String name1 = new String("program1");
        String name2 = new String("program1");

        boolean result1 = (name1 == name2);
        boolean result2 = name1.equals(name2);

        // this is a "very" important project

        String example = "this is a \"very\" important project";

        // Immutability
        // In java strings are immutable. This means, once we create a string , we casnnot
        // change the string.

        String example1 = "hello";
        example1 = example1.concat(" World");
        System.out.println(example1);

        String newStr = "hello";

        char ch = newStr.charAt(0);
        System.out.println(ch);

        System.out.println(newStr.charAt(1));

        System.out.println(newStr.charAt(newStr.length() - 1));

        // substring
        //Range: 0 -> length
        System.out.println(newStr.substring(1, 4));
        System.out.println(newStr.substring(0, 5));

        newStr.substring(1);

        System.out.println(newStr.lastIndexOf('l'));
        System.out.println(newStr.startsWith("He"));

        String s1 = "hello";
        String s2 = s1;
        String s3 = "hello";
        String s4 = new String("hello");

        System.out.println((s1 == s2) + ", " + s1.equals(s2));
        System.out.println((s1 == s3) + ", " + s1.equals(s3));
        System.out.println((s1 == s4) + ", " + s1.equals(s4));
    }
}