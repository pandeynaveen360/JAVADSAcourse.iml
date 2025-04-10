package Arrays;

public class ArrayDemo {
    public static void main(String[] args) {

        int[] arr = new int[5];
        System.out.println(arr);

//      int[] arr = null;
//      arr = new int[5];

        System.out.println(arr.length);

        //get the element of the array
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        // set update

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        for (int i = 0; i < arr.length - 1; i++) {
            System.out.println(arr[i]);
        }

        // Enhanced for loop
        // Moves forward only

        System.out.println("---EF---");
        for (int val : arr) {
            System.out.println(val);
        }

        int[] arr1 = arr;
        arr[3] = 100;
        System.out.println(arr[3]);


        int i = 0; // 10
        int j = 3; // 30

        System.out.println(arr[i] + "," + arr[j]);
        swap(arr[i], arr[j]);
        System.out.println(arr[i] + "," + arr[j]);
    }

    public static void swap(int one , int two) {
        int temp = one;
        one = two;
        two = temp;

    }
}
