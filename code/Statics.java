public class Statics {
    static String clg ="iit";
    int a;
    Statics(int a){
        this.a=a;
    }
    static void change(){
        clg="vvv";
    }
    public static void main(String[] args){
    Statics obj=new Statics(10);
    System.out.println(obj.a);
    System.out.println(clg);
    change();
    System.out.println(clg);
    }
}
