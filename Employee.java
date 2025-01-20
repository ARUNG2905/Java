

class Employee{
    int id;
    String name,dept;
    double salary;
    Employee(int id,String name,String dept,double salary){
        this.id=id;
        this.salary=salary;
        this.dept=dept;
        this.name=name;

    }
    Employee(int id){
        this.id=id;
    }
    Employee(){
        this.id=100;
        this.dept="HR";
        this.name="Arun";
        this.salary=70000;
        
    }
    public static void main(String[] args) {
        Employee e1 =new Employee(120,"Bank","Rukmini",130000);
        System.err.println(e1.id+"  "+e1.dept+"  "+e1.name+"  "+e1.salary);
        Employee e2 = new Employee(130);
        System.out.println(e2.id);
        Employee e3 = new Employee();
        System.out.println(e3.id+"  "+e3.dept+"  "+e3.name+"  "+e3.salary);
    }
}