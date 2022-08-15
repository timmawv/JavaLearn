package avlyakulov.timur.book.chapter_3.customer.service;

import avlyakulov.timur.book.chapter_3.customer.dao.CustomerDao;
import avlyakulov.timur.book.chapter_3.customer.entity.Customer;

public class CustomerService {
    private final CustomerDao customerDao = new CustomerDao();

    public void create (Customer customer) {
        customerDao.create(customer);
    }
    public Customer [] getAlphabetOrder () {
        return customerDao.getAlphabetOrder();
    }
    public Customer [] getCustomersWithRangeCreditNumber (int start, int end) {
        return customerDao.getCustomersWithRangeCreditNumber(start, end);
    }
    public Customer [] findAll () {
        return customerDao.findAll();
    }
}
