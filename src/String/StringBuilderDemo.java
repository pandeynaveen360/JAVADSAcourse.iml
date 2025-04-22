package String;

public class StringBuilderDemo {
    public static void main(String[] args) {

        String str = "hello";
        String str2 = "abc";

        // converting string into string builder for changes.
        StringBuilder sb = new StringBuilder(str2);
        StringBuilder sb1 = new StringBuilder(str);

        //length
        System.out.println(sb1);
        System.out.println(sb1.length());

        //append
        sb1.append("abc");
        System.out.println(sb1);
        sb1.append("def");
        System.out.println(sb1);

        //insert
        //range -> 0 -> length
        sb.insert(sb.length(),'z');// insertion at the last
        sb.insert(0,'n');// insertion at the first
        System.out.println(sb);

        //setCharAt()
        sb.setCharAt(2,'q');
        System.out.println(sb);

        // again converting string builder into string after changes.
        String str1 = sb.toString();
        System.out.println(str1);
    }
}
