//input1 ="Fi er"
//input2 ="Fever:filer:Filter:Fixer:Fiber:Fibre:tailor:offer"
//output String should be returned as "FILER:FIXER:FIBER"
//these are the possible words that can complete imput1
public class IdentifyPossibleWords1 {
    public static void main(String[] args) {
        String word = "Fi_er";
        String strips="Fever:filer:Filter:Fixer:Fiber:Fibre:tailor:offer";
        System.out.println(identify(word, strips));


    }
    public static String identify(String word,String strips){
        String [] arr = strips.split(":");
        String ans="";
       
        for (int i = 0; i < arr.length; i++) {
            boolean flag=true;
            String temp= arr[i];
            if(word.length()!=temp.length()){
                flag=false;
            }
            for(int j=0;j<word.length();j++){
               
                if(temp.charAt(j)!=word.charAt(j) && word.charAt(j)!='_'){
                    flag=false;
                    break;
                }
            }
            if(flag){
                ans+=temp+" ";
            }
        }
        return ans;

    }
}
