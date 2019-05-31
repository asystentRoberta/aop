package pl.com.bohdziewicz.tutorials.aop;

public interface CustomerRepository {
    Customer getCustomer(long customerId);

    String getCustomerName(long customerId);

    void addCustomer(Customer customer);
}
