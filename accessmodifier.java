import java.util.*;

class accessmodifier {
    private int pin;
    private String UserName;

    public void display() {
        System.out.println("cos pin:" + pin);
        System.out.println("cos name:" + UserName);
    }

    public void setValues(String name, int userpin) {
        pin = userpin;
        UserName = name;
    }
    public String getValue(){
        return UserName;
    }

}

class main {
    public static void main(String[] args) {
        accessmodifier cos1 = new accessmodifier();
        cos1.setValues("Rock", 1123);
        cos1.display();
        String str=cos1.getValue();
        System.out.println(str);


    }

}
