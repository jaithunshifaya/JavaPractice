public class CharCount {
    public static void main(String[] args) {
        String str = "programming";
        char ch = 'm';
        int count = 0;

        for (int i = 0; i < str.length(); i++)
            if (str.charAt(i) == ch)
                count++;

        System.out.println("Count of " + ch + " is: " + count);
    }
}
