public class NonStaticblock {
    
    { //non-static block
        //this can be multi line alsoe 
        System.out.println("Non Static block 1");
    }
    public static void main(String [] args){
        System.out.println("main method");
        new NonStaticblock();
        System.out.println("-----------------");
        new NonStaticblock();
        System.out.println("-----------------");
        new NonStaticblock();
        System.out.println("-----------------");
    }

    {
        System.out.println("Non-static block 2");
    }
    {
        System.out.println("Non-static block 3");
    }
    {
        System.out.println("Non-static block 4");
    }
}
