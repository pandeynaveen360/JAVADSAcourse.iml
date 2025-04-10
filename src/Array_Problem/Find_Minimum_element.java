package Array_Problem;

public class Find_Minimum_element {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 1, 6};
        minimumelement(arr);
    }

    public static void minimumelement(int[] arr) {

        //int min = Integer.MIN_VALUE;
         int min = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if(arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println(min);

    }
}
