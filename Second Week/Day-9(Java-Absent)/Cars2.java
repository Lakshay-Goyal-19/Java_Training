public class Cars2 {
    public static void main(String [] args){
        //c1 is one object of the class Cars but we can make number of objects
        Cars c1= new Cars();

        // c1.name="BMW";
        // c1.model="Don't know";

        //c2 is another object of Cars class
        Cars c2=new Cars();
        
        c2.name="Maruti Suzuki";
        c2.model="pta nhi";

        //Note- changing the variable in one object does not change the variable in another object in the same class
        
        System.out.println(c1.name);

    }
}
