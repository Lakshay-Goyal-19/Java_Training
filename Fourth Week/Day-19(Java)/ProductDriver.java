import java.util.Scanner;

public class ProductDriver {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int price=sc.nextInt();
        sc.nextLine();
        String type=sc.nextLine();
        try{
            if(price<0){
                throw new NegativePriceException();
            }
            else{
                System.out.println("Good to go");
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Done");
        }
    }
}
