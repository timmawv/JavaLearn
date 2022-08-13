package avlyakulov.timur.book.chapter_3.customer.CustomerDB;

import avlyakulov.timur.book.chapter_3.customer.entity.Customer;

import java.util.UUID;

public class CustomerDB {
    private Customer[] customers;
    private int current;
    private static CustomerDB instance;


    public static CustomerDB getInstance() {
        if (instance == null)
            instance = new CustomerDB();
        return instance;
    }

    private CustomerDB() {
        customers = new Customer[10];
    }

    public void add(Customer customer) {
        customer.setId(generateId());
        if (current == customers.length) {
            Customer[] customers1 = new Customer[customers.length + 1];
            System.arraycopy(customers, 0, customers1, 0, customers.length);
            customers = customers1;
        }
        customers[current] = customer;
        ++current;
    }

    public String generateId() {
        return UUID.randomUUID().toString();
    }

}