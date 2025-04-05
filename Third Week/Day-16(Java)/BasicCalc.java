//child class of Calc
// + - / *
public class BasicCalc extends Calc {
    public double calculate(double num1,double num2,char ch){
        double ans=0;
        switch (ch) {
            case '+'->ans=num1+num2;
            case '-'->
                ans=num1-num2;
                
            case '*'->
                ans=num1*num2;
            case '/'->
                ans=num1/num2;
                default ->System.out.println("Invalid");
        }
        return ans;
    }
}
