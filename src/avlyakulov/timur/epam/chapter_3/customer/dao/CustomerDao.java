package avlyakulov.timur.epam.chapter_3.customer.dao;

import avlyakulov.timur.epam.chapter_3.customer.CustomerDB.CustomerDB;
import avlyakulov.timur.epam.chapter_3.customer.entity.Customer;

public class CustomerDao {
    public void create (Customer customer) {
        CustomerDB.getInstance().create(customer);
    }
    public Customer [] getAlphabetOrder () {
        return CustomerDB.getInstance().getAlphabetOrder();
    }
    public Customer[] getCustomersWithRangeCreditNumber (int start, int end) {
        return CustomerDB.getInstance().getCustomersWithRangeCreditNumber(start, end);
    }
    public Customer[] findAll () {
        return CustomerDB.getInstance().findAll();
    }
}
