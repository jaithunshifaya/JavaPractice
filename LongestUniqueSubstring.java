import java.util.*;

public class LongestUniqueSubstring {
    public static void main(String[] args) {
        String str = "abcabcbb";
        System.out.println("Length of longest unique substring: " + lengthOfLongestSubstring(str));
    }

    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0, right = 0, maxLength = 0;

        while (right < s.length()) {
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                maxLength = Math.max(maxLength, right - left + 1);
                right++;
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }
        return maxLength;
    }
}
