public class Insta {

    

    public static void main(String [] args){
        User u1 = new User("Lakshay", 123);
        System.out.println("UID is:- "+u1.Id);
        System.out.println("Password is:- "+u1.password);



        User u2 = new User("Piyush", 1234, "free");
        u2.Id="overwrite";
        System.out.println("UID is:- "+u2.Id);
        System.out.println("Password is:- "+u2.password);
        System.out.println("Bio is:- "+u2.bio);

        //accessing the static method inside the class
        User.printData(u2);

    }
}
