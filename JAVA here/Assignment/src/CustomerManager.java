import java.util.*;

public class CustomerManager {
    private List<Customer> customers = new ArrayList<>();

    // Constructor
    public CustomerManager(List<Customer> customers) {
        this.customers = customers;
    }

    // View all customers
    public void viewCustomers() {
        if (customers.isEmpty()) {
            System.out.println("No customers available.");
        } else {
            for (Customer customer : customers) {
                System.out.println(customer);
            }
        }
    }

    // Add new customer
    public void addCustomer(Customer customer) {
        customers.add(customer);
        System.out.println("Customer added successfully.");
    }

    // Search customer by phone number
    public Customer searchCustomerByPhoneNumber(String phoneNumber) {
        for (Customer customer : customers) {
            if (customer.getPhoneNumber().equals(phoneNumber)) {
                return customer;
            }
        }
        return null;
    }

    // Edit customer information
    public void editCustomer(Customer customer, String newName, String newEmail) {
        if (!newName.isEmpty()) {
            customer.setName(newName);
        }
        if (!newEmail.isEmpty()) {
            customer.setEmail(newEmail);
        }
        System.out.println("Customer information updated.");
    }

    // Delete customer by phone number
    public boolean deleteCustomer(String phoneNumber) {
        Customer customer = searchCustomerByPhoneNumber(phoneNumber);
        if (customer != null) {
            customers.remove(customer);
            System.out.println("Customer deleted successfully.");
            return true;
        }
        return false;
    }

    // Get all customers
    public List<Customer> getCustomers() {
        return customers;
    }
}
