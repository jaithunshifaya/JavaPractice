public class MaxMinArray {
    public static void main(String[] args) {
        int[] arr = {3, 9, 1, 5, 12};

        int max = arr[0];
        int min = arr[0];

        for (int num : arr) {
            if (num > max) max = num;
            if (num < min) min = num;
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
