public class Engine {
    String power;
    public Engine(String power){
        super();
        this.power=power;
    }
    Engine(Engine eng){ //copy constructor
        this.power=eng.power;
    }
}
