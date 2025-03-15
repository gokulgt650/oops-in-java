
import java.util.*;

class accessmodifier {
    private int n;
    private String str;

    public void display() {
        System.out.println(n);
        System.out.println(str);
    }

    public void setValues(String nam, int roll) {
        n = roll;
        str = nam;
    }

    public String getValue() {
        return str;
    }
}

class main {
    public static void main(String[] args) {
        accessmodifier u1 = new accessmodifier();
        u1.setValues("gokul", 39);
        u1.display();

        accessmodifier u2 = new accessmodifier();
        u2.setValues("gt", 14);
        u2.display();
        String std2 = u2.getValue();
        System.out.println(std2);
    }
}