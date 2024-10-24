import java.io.*;
import java.util.*;

public class FileHandler {

    private static final String FILE_NAME = "customers.txt";

    // Load customers from file
    public static List<Customer> loadCustomers() {
        List<Customer> customers = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 3) {
                    customers.add(new Customer(data[0], data[1], data[2]));
                }
            }
        } catch (IOException e) {
            System.out.println("Could not load customer data.");
        }
        return customers;
    }

    // Save customers to file
    public static void saveCustomers(List<Customer> customers) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Customer customer : customers) {
                writer.write(customer.getName() + "," + customer.getEmail() + "," + customer.getPhoneNumber());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Could not save customer data.");
        }
    }
}
