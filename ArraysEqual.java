public class ArraysEqual {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {3, 1, 2};
        boolean isEqual =areArraysEqual(a, b);
        System.out.println("Arrays are equal: " + isEqual);
    }
    public static boolean areArraysEqual(int[] a, int[] b){
        if(a.lenght != b.length) return false;
        int[] freq=new int[1001];
        for(int i=0; i<a.length; i++){
            freq[a[i]]++; }
        for(int i=0; i<b.length; i++){
            freq[b[i]]--; }
        for(int i=0; i<freq.length; i++){
            if(freq[i]!=0) return false;
        }
        return true;
    }   
}
