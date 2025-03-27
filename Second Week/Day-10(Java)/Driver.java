// public class Driver {
//     public static void main(String [] args){
//         Demo obj=new Demo();
        
//     }
// }



public class Driver {
    public static void main(String [] args){
        Employee e1 = new Employee(1, "Name");
        Employee e2 = new Employee(1, "Name",21,"R&D");
        e1.data();
        System.out.println();
        e2.data();
    }
}