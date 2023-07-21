import java.util.*;

public class JavaVector {

    public static void main(String[] args) {
        // Vector v=new Vector();
        // v.add(12);
        // v.add("121");
        // v.add(121);
        // System.out.println(v);

        Vector<String> v = new Vector<String>();
        String[] a = new String[10];
        v.add("12");
        v.add("121");
        // add
        v.add("121");
        // add and increase capacity
        v.addElement("obj");

        v.addElement("obj");
        System.out.println(v.contains("obj"));
        // v.copyInto(a);
        System.out.println(a);
        System.out.println(v.capacity());
        System.out.println(v.elementAt(1));
        System.out.println(v.indexOf("obj"));
        v.insertElementAt("obj", 2);
        System.out.println(v.size());
        v.remove("obj");
        System.out.println(v);

    }
}