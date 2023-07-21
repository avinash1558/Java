// {0% to 100%}
abstract class Classex {
    int a, b;

    Classex(int c, int d) {
        a = c;
        b = d;
    }

    abstract void print();
    void print1(){
        System.out.println("classex");
    }
    static void print2(){
        System.out.println("classex");
    }
}

public class Abstractclass extends Classex {
    Abstractclass(int c,int d){
        super(c, d);
    }
    void print() {
        // TODO Auto-generated method stub
        System.out.println("I am Abstractclass");
        System.out.println(a+" "+b);
    }
    public static void main(String[] args){

    Abstractclass obj= new Abstractclass(122,11111);
    obj.print();
    obj.print1();
    Classex obj1=new Abstractclass(111,222222);
    obj1.print1();
    obj1.print();
    print2();
    }
}