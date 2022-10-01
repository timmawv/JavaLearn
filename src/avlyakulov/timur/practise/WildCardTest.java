package avlyakulov.timur.practise;

public class WildCardTest <T extends Number>{
    private T num;
    private String message;
    public WildCardTest (T num,String message) {
        this.num = num;
        this.message = message;
    }
    public boolean equalsToNum (WildCardTest<?> wildCardTest) {
        return parseNum() == wildCardTest.parseNum();
    }
    public int parseNum () {
        return  Math.round(num.floatValue());
    }
    public T getNum () {
        return num;
    }
    public void setNum (T num) {
        this.num = num;
    }
    public void setMessage (String message) {
        this.message = message;
    }

    public static void main(String[] args) {
        WildCardTest<Integer> wildCardTest = new WildCardTest<>(2,"integer");
        WildCardTest<Long> wildCardTest1 = new WildCardTest<>((long)2,"long");
        System.out.println(wildCardTest.equalsToNum(wildCardTest1));
        System.out.println(wildCardTest.getNum().floatValue());
        System.out.println(wildCardTest1.getNum().floatValue());
    }
}