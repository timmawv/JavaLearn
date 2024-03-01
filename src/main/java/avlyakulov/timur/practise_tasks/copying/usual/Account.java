package avlyakulov.timur.practise_tasks.copying.usual;



// реализация неглубоко копирования, когда через Mutable Object мы меняем состояние разных объектов.
public class Account {
    Customer customer;
    private int balance;

    // пример конструктора где он копирует неполностью то есть наш новый объект будет ссылаться на существующий участок в памяти, где расположен объект.
    public Account(Account account) {
        customer = account.customer;
        balance = account.balance;
    }

    public Account(Customer customer, int balance) {
        this.customer = customer;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "customer=" + customer.getName() +
                ", balance=" + balance +
                '}';
    }
}
