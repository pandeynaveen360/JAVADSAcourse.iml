package Functions;

public class Function_1 {
    public static void main(String[] args) {

        System.out.println("Let's get started");
        // Calling a function
        greetingCustomers();
        System.out.println("See you soon !");
        sum_two_numbers(20 , 25);
        sum_two_numbers(2, 2);
        sum_two_numbers(10 , 5);


    }

    // Declaring a function
    public static void greetingCustomers() {

        System.out.println("Hello to you!");
        System.out.println("Hope you 're having a good day!");
    }
    public static void sum_two_numbers(int val1 , int val2) {
        int sum = val1 + val2;
        System.out.println(sum);
    }
}
