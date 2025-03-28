public class App {
    public static void main(String [] args){

        //no matter how many objects are made it will return the same address
        // connection1 and connection2 contain the same address
        Connection connection1 = Connection.getConnection("Test", "Lakshay");
        System.out.println(connection1);
        Connection connection2 = Connection.getConnection("Test", "Lakshay");
        System.out.println(connection2);
    }
}
