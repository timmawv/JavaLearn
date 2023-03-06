package avlyakulov.timur.practise.copying.deep;


// реализация глубокого копирования, когда мы уже не можем изменять наш объект.
public class Account {
    Customer customer;
    private int balance;

    //пример конструктора глубоко копирования, где наш объект будет создан на основе нового участка в памяти
    public Account(Account account) {
        customer = new Customer(account.customer.getName());
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