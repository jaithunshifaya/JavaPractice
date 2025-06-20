public class AllSubstring{
    public static void main(String[] args){
        String str="Shifaya";
        int len=str.length();
        for(int i=0; i<len; i++){
            for(int j=i+1; j<=len; j++){
                System.out.println(str.substring(i,j));
            }
        }
    }    
}
