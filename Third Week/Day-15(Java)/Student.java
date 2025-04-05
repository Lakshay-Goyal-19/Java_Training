public class Student {
    String name;
    int rollNo;
    public Student(String name,int rollNo){
        super();
        this.name=name;
        this.rollNo=rollNo;
    }
    public String toString(){
        String data ="Name "+name;
        return data;
    }
    public boolean equals(Object obj){
        if(obj instanceof Student){
            Student s2 = (Student) obj;
            if(this.name.equals(s2.name) && this.rollNo==s2.rollNo ){
                return true;
            }
            else{
                return false;
            }
        }
        return false;
    }
}
