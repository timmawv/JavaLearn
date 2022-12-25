package avlyakulov.timur.epam.chapter_6.computer.impl;

import avlyakulov.timur.epam.chapter_6.computer.entity.Computer;
import avlyakulov.timur.epam.chapter_6.computer.entity.MobileAction;

import java.util.Random;

public class MobileActionImpl extends Computer implements MobileAction {

    private int battery;
    private boolean dustInPhone;
    private boolean safetyGlass;

    public MobileActionImpl(int price, int ram, int screenResolution, String processor) {
        super(price, ram, screenResolution, processor);
        battery = (int)(Math.random() * 100);
        Random random = new Random();
        dustInPhone = random.nextBoolean();
        safetyGlass = false;
    }


    @Override
    public void changeBattery() {
        battery = 100;
    }

    @Override
    public void clearFromDust() {
        dustInPhone = false;
    }

    @Override
    public void installSafetyGlass() {
        safetyGlass = true;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "battery=" + battery +
                ", dustInPhone=" + dustInPhone +
                ", safetyGlass=" + safetyGlass +
                "} " + super.toString();
    }
}
