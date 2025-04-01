class methodoverloading {
    public static void main(String[] args) {
        min obj1 = new min();
        obj1.min(4, 5);
        obj1.min(6, 7, 8);

    }
}

class min {
    void min(int a, int b) {
        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }

    void min(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println("a is big" + a);
        } else if (b > a && b > c) {
            System.out.println("b is big" + b);
        } else {
            System.out.println("c is big" + c);
        }
    }
}
