public class Car {
    private String brand;

    Engine engine = new Engine(4,"100","hybrid");
    
    Car(String brand){
        this.brand=brand;
    }
    public Engine getEngine(){
        return engine;
    }
    public void setEngine(Engine engine){
        this.engine=engine;
    }   
    public String getBrand(){
        return brand;   
    }
    public void setBrand(String brand){
        this.brand = brand;
    }   
}
