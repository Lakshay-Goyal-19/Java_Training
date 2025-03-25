//read only even indexed elements from an array
public class Question24 {
    public static void main(String [] args){
        int [] a={1,2,3,4,5};
        for(int i=0;i<a.length;i+=2){
            System.out.println(a[i]);
        }
    }
    
}
