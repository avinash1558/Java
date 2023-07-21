public class Loops {
    public static void main(String[] args) {
        int a = 1;
        int b = 5;
        while (a <= 10) {
            System.out.print(a++);
            System.out.print(++a);
            if (a == b) {
                break;
            }
        }
        System.out.println();
        int e=1;
        while (e <= 10) {
            System.out.print(e++);
            // System.out.print(++a);
            if (a == b) {
                continue;
            }
        }
        System.out.println();
        bag1: for (int i = 0; i < 5; i++) {
            System.out.print(i);
            bag2: for (int j = 0; j < 5; j++) {
                System.out.print(j);
                if (i == j) {
                    break bag2;
                }
            }
        }
        System.out.println();
        do {
            System.out.print(a--);
        } while (a >= 1);

        System.out.println();

        int a5[] = {1,2,3};
        for (int string : a5) {
            System.out.println(string);
        }

    }
}
