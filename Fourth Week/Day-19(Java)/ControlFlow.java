import java.util.Scanner;
public class ControlFlow {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter num1:- ");
        int num1=sc.nextInt();
        System.out.println("Enter num2:- ");
        int num2=sc.nextInt();
        try{
            System.out.println(num1/num2);//in case of exception control will go from here directly to catch
            System.out.println("Hello");//this line will not work in case of Exception
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("Thank You");
        sc.close();
    }
}
