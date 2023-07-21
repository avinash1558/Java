public class Constructor {
    int a, b;

    Constructor(int a, int b) {
        this.a = a;
        this.b = b;
    }
    Constructor(Double a, int b) {
        // this.a = a;
        this.a = b;
    }
    Constructor() {
        System.out.println("constructer");
    }

    void print() {
        System.out.println(a);
    }

    public static void main(String[] args) {
        Constructor obj = new Constructor(10, 20);
        Constructor obj2 = new Constructor(10.12, 20);
        Constructor obj1 = new Constructor();
        obj.print();
        obj2.print();

    }
}
