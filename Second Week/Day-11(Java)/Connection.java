//connected with App.java
//Program to show Singleton design pattern
public class Connection {
    private String dbName;
    private String userName;
    private static Connection connection;//it will only be created once in the memory
    private Connection(String dbName,String userName ){
        this.dbName=dbName;
        this.userName=userName;
    }
    public String getdbName(){
        return this.dbName;
    }
    public String getuserName(){
        return this.userName;
    }

    //below is the usual factory method
    // public static Connection getConnection(String dbName,String userName){
    //     return new Connection(dbName, userName);
    // }

    // singleton 
    public static Connection getConnection(String dbName,String userName){
        if(connection==null){
            connection = new Connection(dbName, userName);
        }
        return connection;
    }

}
