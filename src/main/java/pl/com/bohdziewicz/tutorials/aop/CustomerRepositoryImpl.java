package pl.com.bohdziewicz.tutorials.aop;

public class CustomerRepositoryImpl implements CustomerRepository {

    public Customer getCustomer(long customerId) {

        return null;
    }

    public String getCustomerName(long customerId) {

        return "Marcin";
    }

    public void addCustomer(Customer customer) {

        if (customer.getName() == null) {
            throw new RuntimeException("Customer name can't be null");
        } else {
            System.out.println("Customer " + customer.getName() + " saved.");
        }
    }
}
