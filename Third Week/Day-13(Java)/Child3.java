public class Child3 extends Parent3 {
    int k=20;
    int z=99;
    public static void main(String[] args) {
        Parent3 ch=new Child3();//Upcasting (Child -> Parent)
        // System.out.println(ch.k);//Output will be 100
        Child3 ch1 = (Child3) ch; //Downcasting Parent to child
        System.out.println(ch1.k);//Now the output is 20

    }
}
