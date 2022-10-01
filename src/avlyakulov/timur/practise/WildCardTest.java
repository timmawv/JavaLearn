package avlyakulov.timur.practise;

public class WildCardTest <T extends Number>{
    private final T num;

    public WildCardTest (T num) {
        this.num = num;
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


    public static void main(String[] args) {
        WildCardTest<Integer> wildCardTest = new WildCardTest<>(2);
        WildCardTest<Long> wildCardTest1 = new WildCardTest<>((long)2);
        System.out.println(wildCardTest.equalsToNum(wildCardTest1));
        System.out.println(wildCardTest.getNum().floatValue());
        System.out.println(wildCardTest1.getNum().floatValue());
    }
}