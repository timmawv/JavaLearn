package avlyakulov.timur.practise;

public class Practise {

   public class Base {
        public void method() {
            System.out.println("base");
        }
    }

    public static void main(String[] args) {
        Practise.Base base = new Practise().new Base();
        base.method();
    }
}
