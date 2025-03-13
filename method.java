import java.util.*;

class method {
    public static void main(String[] args) {
        int result = add();
        System.out.println(result);
    }

    public static int add() {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        return a + b;

    }
}