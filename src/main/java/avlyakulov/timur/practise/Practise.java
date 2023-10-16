package avlyakulov.timur.practise;

public class Practise {

    public void test() {
        System.out.println("It is test");
    }

    public void test(int a) {
        System.out.println("It is test with int " + a);
    }

    public void test(double a) {
        System.out.println("It is test with double " + a);
    }


    public static void main(String[] args) {
        Practise practise = new NewPractise();
        practise.test();
    }
}

class NewPractise extends Practise {
    public void test() {
        System.out.println("It is a new test");
    }
}