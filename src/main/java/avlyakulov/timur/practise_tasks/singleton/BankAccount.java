package avlyakulov.timur.practise_tasks.singleton;

public class BankAccount {
    private static BankAccount instance;

    String name;
    int balance;

    private BankAccount(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public static BankAccount getInstance(String name, int balance) {
        if (instance == null)
            instance = new BankAccount(name, balance);
        return instance;
    }

    @Override
    public String toString() {
        return String.format("Имя: %s\nБаланс: %d\n", name, balance);
    }

}
