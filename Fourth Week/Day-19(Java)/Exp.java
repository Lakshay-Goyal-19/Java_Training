public class Exp { //Exception 
    // 10/0 is an exceptional case which gives Exception in Java
    public static void main(String[] args) {
        System.out.println("Start");
        try{
            System.out.println(10/0);
        }catch(Throwable ArithmeticException){
            System.out.println(ArithmeticException.getMessage());
        }
        System.out.println("End");
        //Exception Handline 

    }
}
