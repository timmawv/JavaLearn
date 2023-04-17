package avlyakulov.timur.epam.chapter_12.example.semaphore;

import avlyakulov.timur.epam.chapter_9.example.custom_exception.ResourceException;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class ChannelPool<T extends Channel> {
    private final static int POOL_SIZE = 5;
    private Semaphore semaphore = new Semaphore(POOL_SIZE, true);
    private ArrayList<T> resources = new ArrayList<>();

    public ChannelPool(List<T> source) {
        resources.addAll(source);
    }
    public T getResource (Client client,long maxWaitMillis) throws ResourceException {
        try {
            if (semaphore.tryAcquire(maxWaitMillis, TimeUnit.MILLISECONDS)) {
                for (T resource : resources) {
                    if (!resource.isBusy()) {
                        resource.setBusy(true);
                        resource.setBusy(true);
                        System.out.println("Client #" + client.getId()
                                + " took channel " + resource);
                        return resource;
                    }
                }
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        throw new ResourceException("time out" + maxWaitMillis);
    }

    public void releaseResource(Client client, T resource) {
        resource.setBusy(false); // change status of resource
        System.out.println("Client #" + client.getId() + ": " + resource
                + " --> released");
        semaphore.release();
    }

}
