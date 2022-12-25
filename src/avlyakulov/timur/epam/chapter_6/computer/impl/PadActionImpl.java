package avlyakulov.timur.epam.chapter_6.computer.impl;

import avlyakulov.timur.epam.chapter_6.computer.entity.Computer;
import avlyakulov.timur.epam.chapter_6.computer.entity.PadAction;

import java.util.Random;

public class PadActionImpl extends Computer implements PadAction {

    private boolean dustInPad;
    public PadActionImpl(int price, int ram, int screenResolution, String processor) {
        super(price, ram, screenResolution, processor);
        Random random = new Random();
        dustInPad = random.nextBoolean();
    }

    @Override
    public void clearFromDust() {
        dustInPad = false;
    }

    @Override
    public String toString() {
        return "Pad{" +
                "dustInPad=" + dustInPad +
                "} " + super.toString();
    }
}
