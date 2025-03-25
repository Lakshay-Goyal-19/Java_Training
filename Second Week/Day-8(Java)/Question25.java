//read only even indexed elements in the reverse order
public class Question25 {
    public static void main(String [] args){
        int [] a={1,2,3,4,5};
        for(int i=a.length-1;i>=0;i-=2){
            System.out.println(a[i]);
        }
    }
}
