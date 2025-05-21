import java.util.*;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        char result = findFirstNonRepeatingChar(str);

        if (result != 0)
            System.out.println("First non-repeating character: " + result);
        else
            System.out.println("No non-repeating character found.");
    }

    public static char findFirstNonRepeatingChar(String str) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return 0; 
    }
}
