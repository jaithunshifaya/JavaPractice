
public class UnmatchedSubstring {
    public static void main(String[] args) {
        String s1 = "schoollifeisusefull";
        String s2 = "schoollongofuselike";

        StringBuilder part1 = new StringBuilder();
        StringBuilder part2 = new StringBuilder();

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                part1.append(s1.charAt(i));
                part2.append(s2.charAt(i));
            } else {
                if (part1.length() > 0) {
                    System.out.println(part1 + " , " + part2);
                    part1.setLength(0);
                    part2.setLength(0);
                }
            }
        }

        if (part1.length() > 0) {
            System.out.println(part1 + " , " + part2);
        }
    }
}
