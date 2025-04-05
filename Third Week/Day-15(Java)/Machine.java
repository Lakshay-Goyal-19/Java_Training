public class Machine {
    String Name;
    int Price;
    String Purpose;
    public Machine(){}
    public Machine(String name,int price){
        this.Name=name;
        this.Price=price;
    }
    public Machine(String name,int price,String purpose){
       this(name, price);
       this.Purpose=purpose;
    }
    public String toString(){
        String data = "Name of Machine is :- "+Name+" Price of Machine is: "+Price;
        return data;
    }
}
