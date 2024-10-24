import java.util.List;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Load customers from file
        List<Customer> customers = FileHandler.loadCustomers();
        CustomerManager customerManager = new CustomerManager(customers);

        int choice;
        do {
            System.out.println("\nCustomer Management System:");
            System.out.println("1. View Customer List");
            System.out.println("2. Add New Customers");
            System.out.println("3. Search Customer by Phone Number");
            System.out.println("4. Edit Customer Information");
            System.out.println("5. Delete Customer");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    customerManager.viewCustomers();
                    break;
                case 2:
                    addCustomerFlow(customerManager);
                    break;
                case 3:
                    searchCustomerFlow(customerManager);
                    break;
                case 4:
                    editCustomerFlow(customerManager);
                    break;
                case 5:
                    deleteCustomerFlow(customerManager);
                    break;
                case 6:
                    FileHandler.saveCustomers(customerManager.getCustomers());
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 6);
    }

    private static void addCustomerFlow(CustomerManager customerManager) {
        System.out.print("How many customers do you want to add? ");
        int n = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        for (int i = 0; i < n; i++) {
            System.out.println("\nCustomer " + (i + 1) + ":");

            System.out.print("Enter customer name: ");
            String name = scanner.nextLine();

            String email;
            do {
                System.out.print("Enter customer email: ");
                email = scanner.nextLine();
                if (!CustomerValidator.isValidEmail(email)) {
                    System.out.println("Invalid email format. Please try again.");
                }
            } while (!CustomerValidator.isValidEmail(email));

            String phoneNumber;
            do {
                System.out.print("Enter customer phone number: ");
                phoneNumber = scanner.nextLine();
                if (!CustomerValidator.isValidPhoneNumber(phoneNumber)) {
                    System.out.println("Phone number must be 10 digits. Please try again.");
                } else if (customerManager.searchCustomerByPhoneNumber(phoneNumber) != null) {
                    System.out.println("Phone number already exists. Please enter another number.");
                    phoneNumber = "";
                }
            } while (!CustomerValidator.isValidPhoneNumber(phoneNumber) || phoneNumber.isEmpty());

            Customer customer = new Customer(name, email, phoneNumber);
            customerManager.addCustomer(customer);
        }
    }


    private static void searchCustomerFlow(CustomerManager customerManager) {
        System.out.print("Enter phone number to search: ");
        String phoneNumber = scanner.nextLine();
        Customer customer = customerManager.searchCustomerByPhoneNumber(phoneNumber);
        if (customer != null) {
            System.out.println("Customer found: " + customer);
        } else {
            System.out.println("No customer found with this phone number.");
        }
    }

    private static void editCustomerFlow(CustomerManager customerManager) {
        System.out.print("Enter phone number of the customer to edit: ");
        String phoneNumber = scanner.nextLine();
        Customer customer = customerManager.searchCustomerByPhoneNumber(phoneNumber);
        if (customer != null) {
            System.out.print("Edit name (current: " + customer.getName() + "): ");
            String newName = scanner.nextLine();
            System.out.print("Edit email (current: " + customer.getEmail() + "): ");
            String newEmail = scanner.nextLine();
            if (!newEmail.isEmpty() && !CustomerValidator.isValidEmail(newEmail)) {
                System.out.println("Invalid email format. Keeping old email.");
                newEmail = customer.getEmail();
            }
            customerManager.editCustomer(customer, newName, newEmail);
        } else {
            System.out.println("No customer found with this phone number.");
        }
    }

    private static void deleteCustomerFlow(CustomerManager customerManager) {
        System.out.print("Enter phone number of the customer to delete: ");
        String phoneNumber = scanner.nextLine();
        if (!customerManager.deleteCustomer(phoneNumber)) {
            System.out.println("No customer found with this phone number.");
        }
    }
}
