package avlyakulov.timur.practise.constructor;

public class Account {
    private int balance;
    private String name;
    private String sex;
    private String surname;


    public Account() {
        this(120, "Dima", "Man", "Onackiy");
    }

    public Account(String name, String sex) {
        this(140, name, sex, "Boroda");
    }
    public Account(String name) {
        this(name,"Woman");
    }

    public Account(int balance, String name, String sex, String surname) {
        this.balance = balance;
        this.name = name;
        this.sex = sex;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}