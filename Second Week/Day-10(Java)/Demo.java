// public class Demo {
//     int a=20;
    
//     {
//        System.out.println("Non static block 1");
//     }
//     Demo(){
//         System.out.println("Constructor");
//     }
//     {
//        System.out.println("Non static block 2");
//     }
//     public void m1(){
//         System.out.println("Non static method");
//     }
// }



public class Demo {
//to understand the flow of the happening 
//first it will load whole data into the method area and assign default value as zero
//then it will start executing the code
    {
       System.out.println("Non static block 1");
    }
    int a=m1();
    Demo(){
        System.out.println("Constructor");
    }
    {
       System.out.println("Non static block 2");
       System.out.println(a);
    }
    public int m1(){
        System.out.println("Non static method");
        return 100;

    }
}
