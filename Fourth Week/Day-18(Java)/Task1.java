//replaceAll
//replace 
//replaceFirst
//lastIndexOf(String str,char ch)   instead of String
public class Task1 {
    public static void main(String[] args) {
        String str1= new String("Hellol");
        System.out.println(lastindex(str1, 'l'));
    }
    public static int lastindex(String str,char ch){
        for(int i=str.length()-1;i>=0;i--){
            char c = str.charAt(i);
            if(c==ch){
                return i;
            }
        }
        return -1;
    }
}
