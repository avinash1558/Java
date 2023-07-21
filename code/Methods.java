public class Methods {
    int a = 10;
    int b = 20;

    static void fun(int a) {
        System.out.println(a);
    }

    static int fun2(int a) {
        System.out.println(a);
        return a;
    }

    int fun3(int a,int b ){
        System.out.println(a);
        System.out.println(b);
        return a;
    }
    int fun3(String a,int b ){
        System.out.println(a);
        System.out.println(b);
        return b;
    }

    public static void main(String[] args) {
        Methods obj = new Methods();
        obj.fun(3);
        fun(2);
        System.out.println(fun2(10));
        System.out.println(obj.fun3(10, 11));
        System.out.println(obj.fun3("avinasj", 11));
    }
}
