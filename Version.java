public class Version {
    public static void main(String[] args) {
        System.out.println(compareVersion("1.01", "1.001"));  
        System.out.println(compareVersion("1.0", "1.0.0"));   
        System.out.println(compareVersion("0.1", "1.1"));     
        System.out.println(compareVersion("1.2", "1.10"));    
        System.out.println(compareVersion("1.10.1", "1.10")); 
    }

    static int compareVersion(String version1, String version2) {
        String[] v1 = split(version1);
        String[] v2 = split(version2);

        int len1 = v1.length, len2 = v2.length;
        int maxLen = Math.max(len1, len2);

        for (int i = 0; i < maxLen; i++) {
            int num1 = i < len1 ? Integer.parseInt(removeLeadingZeros(v1[i])) : 0;
            int num2 = i < len2 ? Integer.parseInt(removeLeadingZeros(v2[i])) : 0;

            if (num1 < num2)
                return -1;
            if (num1 > num2)
                return 1;
        }
        return 0;
    }

   
    static String[] split(String version) {
        int count = 1;
        for (char c : version.toCharArray()) {
            if (c == '.') count++;
        }

        String[] parts = new String[count];
        int partIndex = 0;
        StringBuilder current = new StringBuilder();

        for (int i = 0; i < version.length(); i++) {
            if (version.charAt(i) == '.') {
                parts[partIndex++] = current.toString();
                current.setLength(0); // reset
            } else {
                current.append(version.charAt(i));
            }
        }
        parts[partIndex] = current.toString(); 
        return parts;
    }

   
    static String removeLeadingZeros(String str) {
        int i = 0;
        while (i < str.length() - 1 && str.charAt(i) == '0')
            i++;
        return str.substring(i);
    }
}
