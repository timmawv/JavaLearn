package avlyakulov.timur.epam.chapter_3.customer.CustomerDB;

import avlyakulov.timur.epam.chapter_3.customer.entity.Customer;

import java.util.Arrays;
import java.util.Comparator;
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

    public void create(Customer customer) {
        customer.setId(generateId());
        if (current == customers.length) {
            Customer[] customers1 = new Customer[customers.length + 1];
            System.arraycopy(customers, 0, customers1, 0, customers.length);
            customers = customers1;
        }
        customers[current] = customer;
        ++current;
    }

    public Customer[] getAlphabetOrder() {
        int i = 0;
        for (Customer customer : customers)
            if (customer!=null)
                ++i;
        Customer [] customers1 = new Customer[i];
        int j = 0;
        for (Customer customer : customers)
            if (customer!=null) {
                customers1[j] = customer;
                ++j;
            }
        Arrays.sort(customers1, Comparator.comparing(Customer::getSurName));
        return customers1;
    }

    public Customer[] getCustomersWithRangeCreditNumber(int start, int end) {
        int i = 0;
        Customer[] customers1 = new Customer[customers.length];
        for (Customer customer : customers)
            if (customer != null)
                if (customer.getCreditCardNumber() > start && customer.getCreditCardNumber() < end) {
                    customers1[i] = customer;
                    ++i;
                }
        return customers1;
    }

    public Customer[] findAll() {
        return customers;
    }

    public String generateId() {
        return UUID.randomUUID().toString();
    }


}