import java.util.*;
public class Zoo {
    public static void main(String[] args) {
        System.out.println("1.Cat");
        System.out.println("2.Dog");
        System.out.println("3.Cow");
        Scanner sc=new Scanner(System.in);
        int type=sc.nextInt();
        sc.close();

        switch (type) {
            case 1:
            Animal cat =new Cat();
            cat.sound();
                break;
            case 2:
            Animal dog =new Dog();
            dog.sound();
                break;
            case 3:
            Animal cow =new Cow();
            cow.sound();
                break;
        
            default:
            System.out.println("Invalid Input");
                break;
        }
    
    }
}
