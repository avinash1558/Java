public class Condition {
    public static void main(String[] args) {
        // ternary operator
        int a = 1;
        String a1 = (a == 1) ? "a" : "b";
        System.out.println(a1);
        // if 
        if (a == 1) {
            System.out.println(a1);
        }
        // if else
        if (a != 1) {
            System.out.println(a1);
        } else {
            System.out.println(a);
        }
        // elseif
        if (a != 1) {
            System.out.println(a1);
        } else if (a==1){
            System.out.println(a);
        }
        // switch case
        char a2='a';
        switch (a2) {
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
