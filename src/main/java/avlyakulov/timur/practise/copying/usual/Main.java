package avlyakulov.timur.practise.copying.usual;

public class Main {
    public static void main(String[] args) {
        Account account = new Account(new Customer("John"), 120);
        Account newAccount = new Account(account);
        System.out.println(account);
        System.out.println(newAccount);
        System.out.println("Изменим имя кастомера с помощью new Account");
        newAccount.customer.setName("Alik");
        System.out.println("Базовый аккаунт " + account);
        System.out.println("Новый аккаунт " + newAccount);
        System.out.println("Изменим имя кастомера с помощью Account");
        account.customer.setName("Max");
        System.out.println("Базовый аккаунт " + account);
        System.out.println("Новый аккаунт " + newAccount);
    }
}