package avlyakulov.timur.practise;

public class Practise {
    public int size = 0;

    static class Inner {
        public void incrementSize() {
            new Practise().size +=1;
        }

        public static void main(String[] args) {

        }
    }
}