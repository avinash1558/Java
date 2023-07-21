class Inheritance {
int id;
float salary;
Inheritance(int id,float salary){
    this.id=id;
    this.salary=salary;
}
void print(){
    System.out.println(id +" "+salary);
}
void dis(){
    System.out.println("i am singleinheritance");
}
}

public class Singleinheritance extends Inheritance {
    String program;
    Singleinheritance(int id,float salary,String program){
        super(id, salary);
        System.out.println(super.salary);
        this.program=program;
    }
    void print(){
        super.dis();
        System.out.println(id +" "+salary+" "+program);
    }
    public static void main(String[] args) {
        Singleinheritance obj=new Singleinheritance(1001, 120000, "python");
        obj.print();
        Inheritance obj1=new Inheritance(10011, 130000);
        obj1.print();
    }
}