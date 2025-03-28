//connected to User class
public class School {
    public static void main(String [] args){
        // User u1 = new User("Lakshay",21);

        //below is the way to access the factory method 
        //it is accessed using the class name 
        User u1=User.getStudentObject("Lakshay", 21);
        System.out.println(u1);//address returned by the object

        // u1.setName("Lakshay");
        // u1.setAge(21);
        System.out.println(u1.getName());
        System.out.println(u1.getAge());
    }
}

