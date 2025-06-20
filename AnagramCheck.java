public class AnagramCheck {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        if (isAnagram(str1,str2){
            System.out.println("Anagram");
        } else{
            System.out.println("Not Anagram");
        }    
    }
    public static boolean isAnagram(String str1, String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        int[] count=new int[26];
        for(int i=0; i<str1.length(); i++){
            count[str1.charAt(i) - 'a']++;
            count[str2.charAt(i) - 'a']--;
        }
        for(int i=0; i<26; i++){
            if(count[i]!=0){
                return false;
            }
        }
        return true;
    }   
}
