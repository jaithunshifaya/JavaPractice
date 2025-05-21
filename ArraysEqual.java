import java.util.Arrays;

public class ArraysEqual {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {3, 1, 2};

        Arrays.sort(a);
        Arrays.sort(b);

        boolean isEqual = Arrays.equals(a, b);
        System.out.println("Arrays are equal: " + isEqual);
    }
}
