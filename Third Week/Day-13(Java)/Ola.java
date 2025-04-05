import java.util.Scanner;
public class Ola {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Auto");
        System.out.println("2. Bike");
        System.out.println("3. Sedan");
        int type = sc.nextInt();
        sc.close();

        Cab cab=null; 

        switch (type) {
            case 1:
                cab = new Auto("Auto");//Upcasting 
                break;
            case 2:
                cab = new Bike("Bike");//Upcasting 
                break;
            case 3:
                cab = new Sedan("Sedan");//Upcasting 
                break;
        
            default:
                System.out.println("Invalid Input");
                break;
        }
        //obj.ref.variable instaneof Classname
        if(cab instanceof Auto){
            Auto auto =(Auto) cab; //downcasting
            System.out.println(auto.type);
            System.out.println(auto.price);
        }
        else if(cab instanceof Sedan){
            Sedan sedan = (Sedan) cab; //downcasting
            System.out.println(sedan.type);
            System.out.println(sedan.price);
        }
        else if(cab instanceof Bike){
            Bike bike = (Bike) cab; //upcasting
            System.out.println(bike.type);
            System.out.println(bike.price);
        }

        // Auto auto =(Auto) cab;
        //System.out.println(cab instanceof Sedan); //particular instance is present or not in that particular class
        // System.out.println(cab.type+" Booked");
        // System.out.println(auto.price);
        //Cab accepts all types of data 
        // // Auto auto = new Auto("Auto");
        // Cab bike = new Bike("Bike");
        // System.out.println(bike.type);
    }
}
