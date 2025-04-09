package Functions;

import com.sun.jdi.PathSearchingVirtualMachine;

public class MethodOverloading{

    // In java, two or more methods may have the same name if they differ in parameters
    //(different no of parameters, different types of parameters, or both).
    // These methods are called overloaded methods and this features is called overloading.

    // void  func() {...}
    // void  func(int a) {....}
    // float func(double a) {...}
    // float func(int a, float b)  {....}

    // Method overloading is not associated with return types
    // Overloading methods may have the same or different return types, but they must differ in parameters.

    // Method overloading is not associated with return types.
    // Overloaded methods may have the same or different return types, but they must differ in parameters.

    public static String formatNumber(int value) {
        return String.format("%d", value);
    }

    public static String formatNumber(double value) {
        return String.format("%.3f", value);
    }

    public static String formatNumber(String value) {
        return String.format("%.2f", Double.parseDouble(value));

    }

    public static void main(String[] args) {

        System.out.println(formatNumber(500));
        System.out.println(formatNumber(89.9934));
        System.out.println(formatNumber("550"));

    }
}
