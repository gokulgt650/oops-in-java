class Parent {
    void show() {
        System.out.println("Method in Parent Class");
    }
}

class Child extends Parent {
    @Override
    void show() {
        System.out.println("Overridden Method in Child Class");
    }
}

public class Main {
    public static void main(String[] args) {
        Parent obj = new Child(); // Creating a Child object using Parent reference
        obj.show(); // Output: Overridden Method in Child Class
    }
}
