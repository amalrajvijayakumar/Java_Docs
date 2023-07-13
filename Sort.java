package self;

import java.util.Arrays;

public class Sort {

    public static void main(String[] args) {
        int[] array = {10, 5, 2, 7, 1, 8, 3, 9, 6, 4};

        // Sort the array using merge sort
        Arrays.sort(array);

        // Print the sorted array
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }
}