//use of split method
public class Split {
    public static void main(String[] args) {
        String str1 = "I HATE JAVA";
        String[] strArray = str1.split(" ");//stored inside String array and divided by regex
        for(String s:strArray){
            System.out.println(s);
        }
    }
}
