package avlyakulov.timur.epam.chapter_12.example.semaphore;

public abstract class Channel {
    private volatile boolean busy;

    public boolean isBusy() {
        return busy;
    }

    public void setBusy(boolean busy) {
        this.busy = busy;
    }

    public abstract void using();
}
