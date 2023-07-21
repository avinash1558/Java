public class Classs {
    int a = 10;
    int b = 20;
    final int c = 30;

    public static void main(String[] args) {
        Classs obj = new Classs();
        System.out.println(obj.a);
        System.out.println(obj.a + obj.b);
        obj.a = 300;
        System.out.println(obj.a);
        System.out.println(obj.c);
        // final
        // obj.c=20;
        // System.out.println(obj.c);

    }
}
