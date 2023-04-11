package avlyakulov.timur.practise.generic.genericpair;

//Создайте класс Pair<K, V>, который будет представлять собой пару ключ-значение.
//Реализуйте методы:
//getKey() - возвращает ключ
//getValue() - возвращает значение
public class Pair<K, V> {
    private K key;
    private V value;

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
    public void setKey (K key) {
        this.key = key;
    }
    public void setValue (V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "key=" + getKey() +
                ", value=" + getValue() +
                '}';
    }

    public static void main(String[] args) {
        Pair<Integer, String> pair = new Pair<>();
        pair.setKey(12);
        pair.setValue("Maksim");
        System.out.println(pair);
    }
}