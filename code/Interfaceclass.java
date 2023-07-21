interface Faceclass {
    // not support
    // int a, b;
    // Faceclass(int a,int b){
    // this.a=a;
    // this.b=b;
    // }
    final int a = 10;

    void pro();

    void print(int a);

    default void pro2() {
        System.out.println("i am avinash");
    }
    public static void method(){
        System.out.println("static method");
    }

}

public class Interfaceclass implements Faceclass {
    int a, b;

    Interfaceclass(int a, int b) {
        this.a = a;
        this.b = b;
        // not support
        // super(a,b);
    }

    @Override
    public void pro() {
        // TODO Auto-generated method stub
        System.out.println("interface class");
    }

    @Override
    public void print(int a) {
        System.out.println(a);
    }

    public static void main(String[] args) {

        Faceclass obj = new Interfaceclass(122, 2222);
        obj.pro();
        System.out.println(obj.a);
        obj.print(1222);
        obj.pro2();
        Interfaceclass obj1 = new Interfaceclass(122, 1111);
        obj1.pro();
        // obj.method();

    }
}