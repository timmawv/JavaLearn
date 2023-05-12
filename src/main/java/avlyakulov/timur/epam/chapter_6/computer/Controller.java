package avlyakulov.timur.epam.chapter_6.computer;

import avlyakulov.timur.epam.chapter_6.computer.impl.ComputerActionImpl;
import avlyakulov.timur.epam.chapter_6.computer.impl.MobileActionImpl;
import avlyakulov.timur.epam.chapter_6.computer.impl.PadActionImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//todo понять как создать какой то девайс со своими методами, без созданий всех отдельных сущностей
public class Controller {
    ComputerActionImpl computer;
    MobileActionImpl mobile;
    PadActionImpl pad;

    public boolean checkInstance (Object object) {
        if (object == null){
            System.out.println("You don't create your device");
            return false;
        }
        else return true;
    }

    public void run() {
        String position;
        runNavigation();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Computer/Mobile/Pad");
            System.out.println("What device you want to create write from this list ");
            String device = reader.readLine();
            while ((position = reader.readLine()) != null) {
                if (position.equals("0"))
                    System.exit(0);
                else {
                    int pos = Integer.parseInt(position);
                    crud(reader, pos);
                }
            }
        } catch (IOException | IllegalArgumentException e) {
            System.out.println("You have enter the wrong value " + e.getMessage());
        }
    }

    public void crud(BufferedReader reader, int pos) {
        switch (pos) {
            case 1 -> {

            }
            case 2->
            {}
            default -> System.out.println("You enter the wrong value");
        }
    }

    public void runNavigation() {
        System.out.println();
        System.out.println("If you want to create comp/mobile/pad press 1");
        System.out.println("If you want to finish program press 0");
        System.out.println();
    }
}
