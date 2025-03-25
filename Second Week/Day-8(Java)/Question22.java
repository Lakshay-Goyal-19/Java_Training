//read first half of the elements in reverse order
public class Question22 {
    public static void main(String [] args){
        int [] arr={1,2,3,4,5};
        for(int i=(arr.length)/2;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
}