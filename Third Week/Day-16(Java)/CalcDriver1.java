import java.util.Scanner;

public class CalcDriver1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1,num2;
        System.out.println("Enter two numbers:- ");
        num1 = sc.nextDouble();
        num2 = sc.nextDouble();
        System.out.println("Enter the operation:- ");
        char ch = sc.next().charAt(0);
        sc.close();
        Calc1 c = new AdvancedCalc1();
        System.out.println(c.calculate(num1, num2, ch));

    }
}
