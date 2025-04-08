public class MultipleCatch {
    public static void main(String[] args) {
        System.out.println("Start");
        int[] arr = new int[2];
        try{
            System.out.println(arr[2]);
        }
        catch( ArrayIndexOutOfBoundsException e ){
            System.out.println(e.getMessage());
        }
        catch(Exception e ){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("End");
        }
    }
}
