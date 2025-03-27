public class Employee {
    int eid;
    String name;
    int age;
    String department;
    int salary;

    Employee(int eid,String name){
        this.eid=eid;
        this.name=name;
    }
    Employee(int eid,String name,int age){
        this(eid, name);
        this.age=age;
    }
    Employee(int eid,String name,int age,String department){
        this(eid, name, age);
        this.department=department;
    }

    void data(){
        if(this.eid !=0) System.out.println(eid);
        if(this.name !=null) System.out.println(name);
        if(this.age !=0) System.out.println(age);
        if(this.department !=null) System.out.println(department);
        if(this.salary !=0) System.out.println(salary);
    }
}
