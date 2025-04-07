public class Car{
    int price;
    Engine eng;
    public Car(int price,Engine e){
        super();
        this.price=price;
        this.eng=e;
    }
    public Car(Car car){//copy constructor
        this.price = car.price;
        this.eng = new Engine(car.eng);
    }
}
