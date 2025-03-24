//Reverse a integer without using loop.
class Reverse{
    public static void main(String [] args){
        int n=1211;
        int x=n;
        int rev=0;
        int a=n%10;
        n=n/10;
        int b=n%10;
        n=n/10;
        rev=a*100+b*10+n;
        // System.out.println(rev);
        if(x==rev)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not a Palindrome");
        }
    }
}