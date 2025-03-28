public class User {
    private String name;
    private int age;
    //below constructor is private now
    private User(String name,int age){
        this.age=age;
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    //below method should be static now
    //it is also called factory method and it should be static
    //so that it can be accessed with the class
    public static User getStudentObject(String name,int age){
        return new User(name,age);
    }

}
