package avlyakulov.timur.epam.chapter_11.example.map.weakHashMap;

public class Key {
    private int keyUnique;
    private boolean isProcessed;
    public Key(int keyUnique) {
        this.keyUnique = keyUnique;
    }
    public boolean isProcessed() {
        return isProcessed;
    }
    public void setProcessed(boolean processed) {
        isProcessed = processed;
    }

    @Override
    public String toString() {
        return "Key{" +
                "keyUnique=" + keyUnique +
                ", isProcessed=" + isProcessed +
                '}';
    }
}
