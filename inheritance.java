import java.util.*;

class inheritance {
    int stduid = 39;
    String stduName = "gt";

    public static void stduid() {
        System.out.println("the roll number of student is:39");

    }

    public static void stduName() {
        System.out.println("the name of the student is:gt");

    }
}

class call extends inheritance {
    public static void main(String[] args) {
        inheritance roll1 = new inheritance();
        System.out.println(roll1.stduid);
        System.out.println(roll1.stduName);
        roll1.stduName();
        roll1.stduid();

    }
}
