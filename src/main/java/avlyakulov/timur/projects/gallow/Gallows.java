package avlyakulov.timur.projects.gallow;

public class Gallows {
    public int life;

    public Gallows() {
        this.life = 5;
    }

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

    public void startGame() {
        System.out.println("The game has started ");
        gallowsState();

    }
}