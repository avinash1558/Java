class Inheritance {
    int id;
    float salary;

    Inheritance(int id, float salary) {
        this.id = id;
        this.salary = salary;
    }

    void print() {
        System.out.println(id + " " + salary);
    }

    void dis() {
        System.out.println("i am singleinheritance");
    }
}

class Hierarchicalinheritance1 extends Inheritance {
    String program;

    Hierarchicalinheritance1(int id, float salary, String program) {
        super(id, salary);
        System.out.println(super.salary);
        this.program = program;
    }

    void print() {
        super.dis();
        System.out.println(id + " " + salary + " " + program);
    }
}

class Hierarchicalinheritance2 extends Inheritance {
    String code;

    Hierarchicalinheritance2(int id, float salary, String codeString) {
        super(id, salary);
        System.out.println(super.salary);
        code = codeString;
    }

    void print() {
        super.dis();
        System.out.println(id + " " + salary + " " + code);
    }
}

public class Hierarchicalinheritance {

    public static void main(String[] args) {

        Hierarchicalinheritance1 obj1 = new Hierarchicalinheritance1(1200, 140000, "CPP");
        obj1.print();
        Hierarchicalinheritance2 obj2 = new Hierarchicalinheritance2(1200, 140000, "CPP");
        obj2.print();
        Inheritance obj = new Inheritance(212, 1000000);
        obj.print();
    }
}