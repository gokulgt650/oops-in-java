import java.util.*;

class area {
    int h;
    int l;
    int b;
    int w;
    int ans1;
    int ans2;

    public void display() {
        if (ans1 != 0) {
            System.out.println(ans1);
        } else if (ans2 != 0) {
            System.out.println(ans2);
        }
    }
}

class classandmethod {
    public static void main(String[] args) {
        area height = new area();
        height.h = 5;
        height.l = 5;
        height.ans1 = 5 * 5;
        height.display();
        area lenArea = new area();
        lenArea.b = 8;
        lenArea.w = 9;
        lenArea.ans2 = 9 + 8;
        lenArea.display();

    }
}