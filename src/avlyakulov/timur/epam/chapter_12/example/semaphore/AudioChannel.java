package avlyakulov.timur.epam.chapter_12.example.semaphore;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class AudioChannel extends Channel {
    private int channelId;

    public AudioChannel(int id) {
        this.channelId = id;
    }

    public int getChannelId() {
        return channelId;
    }

    public void setChannelId(int id) {
        this.channelId = id;
    }

    @Override
    public void using() {
        try {
            TimeUnit.MILLISECONDS.sleep(new Random().nextInt(500));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("AudioChannel{");
        sb.append("id=").append(channelId);
        sb.append(", busy=").append(isBusy()).append('}');
        return sb.toString();
    }
}
