package Array_Problem;

public class Reverse_array {
    public static void main(String[] args) {

        int[] arr = {20, 30, 40, 50, 60};
        display(arr);
        reverse(arr);
        display(arr);
    }

    public static void display(int[] arr) {

        for (int i = 0; i <= arr.length-1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void reverse(int[] arr) {

        int i = 0;
        int j = arr.length-1;

        while(i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }
}
