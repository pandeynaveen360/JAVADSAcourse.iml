package Problem;

public class replaceAscii {
    public static void main(String[] args) {

        System.out.println(replaceAsciiFunc("cdEfG"));
    }
    public static String replaceAsciiFunc(String str) {
        StringBuilder sb = new StringBuilder(str); // cdEfG

        for(int i = 0; i< sb.length(); i++) {
            char ch = sb.charAt(i);
            if(i % 2 ==0) {
                ch = (char)(ch + 1);
                sb.setCharAt(i,ch);
            }
            else {
                ch = (char)(ch - 1);
                sb.setCharAt(i,ch);
            }
        }
        return sb.toString();
    }
}
