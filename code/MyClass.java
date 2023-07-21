import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        char a=s.next().charAt(0);
        switch (a) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(a+" is vowel");
                break;
        
            default:
                System.out.println(a+" is consonant");
        }

        
    }
}