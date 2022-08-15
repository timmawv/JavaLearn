package avlyakulov.timur.epam.chapter_3.customer.entity;

/*Customer: id, Фамилия, Имя, Отчество, Адрес, Номер кредитной карточки, Номер банковского счета.
        Создать массив объектов. Вывести:
        a) список покупателей в алфавитном порядке;
        b) список покупателей, у которых номер кредитной карточки находится в заданном интервале. */

public class Customer {
    private String id;
    private String surName;
    private String name;
    private String address;
    private int creditCardNumber;
    private int BankAccountNumber;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(int creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public int getBankAccountNumber() {
        return BankAccountNumber;
    }

    public void setBankAccountNumber(int bankAccountNumber) {
        BankAccountNumber = bankAccountNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", surName='" + surName + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", creditCardNumber='" + creditCardNumber + '\'' +
                ", BankAccountNumber='" + BankAccountNumber + '\'' +
                '}';
    }
}
