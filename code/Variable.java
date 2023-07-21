import java.util.Scanner;
public class Variable {
    // variable=is like container
    // data type  variable name = value
    // first letter is not number and case sensitive

    // data type
    // primitive(single value) and non primitive (many value)

    public static void main(String[] args) {
        // formula -(2^k)/2 to (2^k)/2 -1

        // byte (1byte)
        byte a=123;
        System.out.println(a);

        // short (2b)
        short b=1000;
        System.out.println(b);

        // int (4b)
        int c=1110020;
        System.out.println(c);

        // float (4b ,decimal point is 7 digit)
        float d=123f;
        System.out.println(d);

        // long (8b)
        long e=123l;
        System.out.println(e);

        // double (8b ,decimal point is 7 to 18 digit)
        double f=123;
        System.out.println(f);

        // char (2b ,)
        char g='3';
        System.out.println(g);

        // boolean (true,false)
        boolean n=true;
        System.out.println(n);

        // create scanner object
        // new - is create new object
        // system.in - for reading keyword input 
        Scanner s= new Scanner(System.in);
        // help of object to get input 
        // int a1=s.nextInt();
        char a1=s.next().charAt(0);

        // int a1=s.nextInt();
        System.out.println(a1);
        // hasnextint - return true and false (boolean)
        // boolean a2=s.hasNextInt();
        // System.out.println(a2);

        String str2= s.nextLine();

        System.out.println(str2);
        System.out.println(c+g);

    }
}
