package avlyakulov.timur.practise_tasks.singleton;

public class Main {

    public static void main(String[] args) {
        BankAccount account = BankAccount.getInstance("John",120);
        BankAccount account1 = BankAccount.getInstance("Diego",200);
        System.out.println(account);
        System.out.println(account1);
    }
}
