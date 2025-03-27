public class User {
    String Id;
    int password;
    String bio;

    User(String Id,int password){
        this.Id=Id;
        this.password=password;
    }

    User(String Id,int password,String bio){
        this(Id, password);
        this.bio=bio;
    }

    //way to access this static method inside the driver class
    public static void printData(User user){
        System.out.println(user.Id);
        System.out.println(user.password);
        System.out.println(user.bio);
    }
}