//linear search
public class Question28 {
    public static int linear(int [] arr,int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1; 
    }
    public static void main(String [] args){
        int [] a={1,2,3,4,5};
       System.out.println("Index is:- "+linear(a, 5));
    }
}
