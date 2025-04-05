//power and modulous
//child class of Calc

public class AdvancedCalc extends BasicCalc {
    public double calculate(double num1,double num2,char ch){
        double ans=0;
        switch (ch) {
            case '^' -> ans=Math.pow(num1,num2);
            case '%' -> ans=num1%num2;
            default -> ans= super.calculate(num1, num2, ch);
        }
        return ans;
    }
}
