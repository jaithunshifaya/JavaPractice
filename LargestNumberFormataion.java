import java.util.*;

public class LargestNumberFormataion {
    public static void main(String[] args) {
        Integer[] arr = {8, 7, 1, 9};

        Arrays.sort(arr, (a, b) -> (b + "" + a).compareTo(a + "" + b));
        for (int num : arr) {
            System.out.print(num);
        }
    }
}

