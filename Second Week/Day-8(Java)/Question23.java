//read second half of the elements in reverse order
public class Question23 {
    public static void main(String [] args){
        int [] a={1,2,3,4,5,6};
        for(int i=a.length-1;i>=a.length/2;i--)
        {
            System.out.println(a[i]);
        }
    }
}
