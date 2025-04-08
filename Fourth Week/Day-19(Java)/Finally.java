import java.util.Scanner;
public class Finally {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("DB Open");
        System.out.println("Enter num1:- ");
        int num1=sc.nextInt();
        System.out.println("Enter num2:- ");
        int num2=sc.nextInt();
        try{
            System.out.println(num1/num2);
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{ //this block will get executed even in the case of exception
            System.out.println("DB Close");
            System.out.println("Thank You");
        }
        sc.close();
    }
}
