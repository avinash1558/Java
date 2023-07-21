public class Copyconstructor {
    int a;
    Copyconstructor(int a){
        this.a=a;
    }
    Copyconstructor(Copyconstructor s){
        this.a=s.a;
    }
    Copyconstructor(){

    }
    void print(){
        System.out.println(a);
    }
    public static void main(String[] args){
    Copyconstructor a1=new Copyconstructor(10);
    Copyconstructor a2=new Copyconstructor(a1);
    a1.print();
    a2.print();
        Copyconstructor a3=new Copyconstructor();
        a3.a=a2.a+10;
        a3.print();

    }
}
