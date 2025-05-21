import java.util.*;

public class LargestConcatNumber {
    public static void main(String[] args) {
        String[] arr = {"123", "12345", "77"};

        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));
        for (String s : arr) 
        	System.out.print(s);
    }
}
