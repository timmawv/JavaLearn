package avlyakulov.timur.epam.chapter_12.example.semaphore;

import avlyakulov.timur.epam.chapter_9.example.custom_exception.ResourceException;

public class Client extends Thread{
    private ChannelPool<AudioChannel> pool;
    public Client(ChannelPool<AudioChannel> pool) {
        this.pool = pool;
    }
    public void run() {
        AudioChannel channel = null;
        try {
            channel = pool.getResource(this,500);
            channel.using();
        } catch (ResourceException e) {
            System.err.println("Client #" + this.getId() + " lost ->"+ e.getMessage());
        } finally {
            if (channel != null) {
                pool.releaseResource(this,channel);
            }
        }
    }
}
