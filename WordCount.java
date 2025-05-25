public class WordCount {
    public static void main(String[] args) {
        String str = "Java is fun and powerful";
        String[] words = str.trim().split("\\s+");
        System.out.println("Total words: " + words.length);
    }
}
