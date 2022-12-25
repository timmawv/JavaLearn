package avlyakulov.timur.epam.chapter_6.computer.impl;

import avlyakulov.timur.epam.chapter_6.computer.entity.Computer;
import avlyakulov.timur.epam.chapter_6.computer.entity.ComputerAction;

public class ComputerActionImpl extends Computer implements ComputerAction {
    public ComputerActionImpl(int price, int ram, int screenResolution, String processor) {
        super(price, ram, screenResolution, processor);
    }

    @Override
    public void addRAM(int ram) {
        if (this.getRam() > ram)
            System.out.println("Your ram is less than you have");
        else this.setRam(ram);
    }

    @Override
    public String toString() {
        return "Computer " + super.toString();
    }
}