package avlyakulov.timur.projects.gallow2_0;

import java.util.List;

public class GallowsState {
    private int life = 5;

    public void gallowsState() {
        switch (life) {
            case 5 -> {
                System.out.println("\t----|");
                System.out.println("\t|\t|");
                System.out.println("  \t\t|");
                System.out.println("  \t\t|");
                System.out.println("  \t\t|");
                System.out.println("  \t\t|");
                System.out.println("  \t\t|");
                System.out.println("\t-------");
            }
            case 4 -> {
                System.out.println("\t----|");
                System.out.println("\t|\t|");
                System.out.println("  \tO\t|");
                System.out.println("  \t\t|");
                System.out.println("  \t\t|");
                System.out.println("  \t\t|");
                System.out.println("  \t\t|");
                System.out.println("\t-------");
            }
            case 3 -> {
                System.out.println("\t----|");
                System.out.println("\t|\t|");
                System.out.println("  \tO\t|");
                System.out.println("  \t|\t|");
                System.out.println("  \t\t|");
                System.out.println("  \t\t|");
                System.out.println("  \t\t|");
                System.out.println("\t-------");
            }
            case 2 -> {
                System.out.println("\t----|");
                System.out.println("\t|\t|");
                System.out.println("  \tO\t|");
                System.out.println("   _|_\t|");
                System.out.println("\t\t|");
                System.out.println("  \t\t|");
                System.out.println("  \t\t|");
                System.out.println("\t-------");
            }
            case 1 -> {
                System.out.println("\t----|");
                System.out.println("\t|\t|");
                System.out.println("   _O_\t|");
                System.out.println("   \t|\t|");
                System.out.println("   / \t|");
                System.out.println("  \t\t|");
                System.out.println("  \t\t|");
                System.out.println("\t-------");
            }
            case 0 -> {
                System.out.println("\t----|");
                System.out.println("\t|\t|");
                System.out.println("   _O_\t|");
                System.out.println("   \t|\t|");
                System.out.println("   / \\\t|");
                System.out.println("  \t\t|");
                System.out.println("  \t\t|");
                System.out.println("\t-------");
            }
        }
    }

    public void printGallows(char[] word, List<String> usedWords) {
        gallowsState();
        System.out.print("Hidden word ");
        for (char w : word)
            System.out.print(w + " ");
        System.out.println();
        System.out.println("Used words " + usedWords);
    }

    public void decreaseLife() {
        --life;
    }

    public int getLife() {
        return life;
    }
}
