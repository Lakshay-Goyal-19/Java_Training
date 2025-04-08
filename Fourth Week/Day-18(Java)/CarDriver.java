//driver class to show clone method
public class CarDriver {
    public static void main(String[] args) throws CloneNotSupportedException {
        Car c1= new Car(1000, new Engine("1000HP"));
        Car c2=(Car) c1.clone();
        c2.eng.power="20HP";
        System.out.println("Car 1 : "+c1.eng.power);
        System.out.println("Car 2 : "+c2.eng.power);
    }
}
