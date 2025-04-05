public interface IntroToInterface1 {
    int a=20;
    default void m1(){
        System.out.println("Default Method");
    }
    public static void main(String[] args) {
        System.out.println("Interface");
    }
}
