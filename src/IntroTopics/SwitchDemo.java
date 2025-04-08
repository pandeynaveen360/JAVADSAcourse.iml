package IntroTopics;

public class SwitchDemo {
    public static void main(String[] args) {

        int number = 29;

        String size;
        switch(number) {

            case 29:
                size = "small";
                break;
            case 48:
                size = "Large";
                break;
            case 50:
                size = "Extra Large";
                break;
            default:
                size = "Unknown";
                break;
        }

        System.out.println("size :" + size);
    }
}
