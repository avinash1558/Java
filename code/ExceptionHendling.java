public class ExceptionHendling {
    static void division(int a,int b) throws ArithmeticException{
        if (b==0){
            throw new ArithmeticException("Arithmetic Exception");
        }
    }

    public static void main(String[] args){
    try {
        division(10, 0);
        System.out.println(10/0);
    } catch (Exception e) {
        //TODO: handle exception
        System.out.println(e.getMessage());
        System.out.println("catch");
    }finally{
        System.out.println("Always");
    }



    }
}
