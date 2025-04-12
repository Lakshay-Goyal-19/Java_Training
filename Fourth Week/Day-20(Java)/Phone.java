public class Phone implements Comparable {
    String company;
    int Price;
    Double storage;
    public Phone(String company,int Price,double storage){
        super();
        this.company=company;
        this.Price=Price;
        this.storage=storage;
    }
    @Override
    public String toString(){
        return "Name- "+company+" Price- "+Price+" Rating- "+storage; 
    }
    // @Override
    // public int compareTo(Object o){
    //     Phone b2 =(Phone) o; //following way is one way to define sorting mechanism
    //     if(this.Price< b2.Price){
    //         return -1;
    //     }
    //     if(this.Price>b2.Price){
    //         return 1;
    //     }
    //     else{
    //         return 0;
    //     }
    // }
    @Override
    public int compareTo(Object o){
        Phone b2=(Phone) o;
        // return this.Price-b2.Price;//this is another way 
        // return this.storage.compareTo(b2.storage);
        if(this.Price!=b2.Price){
            return this.Price-b2.Price;
        }//if the prices are same then check on the basis of storage
        return this.storage.compareTo(b2.storage);
    }
}

