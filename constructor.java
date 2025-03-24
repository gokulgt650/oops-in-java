class Sample {
    int passmark;
    int mark;
    int mark2;

    Sample(int sub1, int sub2) {
        passmark = 45;
        mark = sub1;
        mark2 = sub2;

    }

}

class Solution {
    public static void main(String[] args) {
        Sample std1 = new Sample(48, 76);
        if (std1.mark > 45) {
            System.out.println("you pass!!!");
        } else if (std1.mark2 > 45) {
            System.out.println("you passs!!!!!");

        } else {
            System.out.println("you fail!!!");
        }

    }
}
