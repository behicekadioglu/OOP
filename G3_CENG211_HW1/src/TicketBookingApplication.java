import java.io.FileNotFoundException;
import java.io.IOException;

public class TicketBookingApplication {
<<<<<<< Updated upstream
    public static void main(String[] args) throws Exception {
=======
    public static void main(String[] args) throws IOException{
        // read the customer file to get the names and the number of tickets of the customer
        FileIO io = new FileIO();
        String[][] customerInfo = io.readFile("G3_CENG211_HW1/customers.csv");

        // create the venue, it will create everything about the venue for the program
        Venue venue = new Venue();

        // create the customers and book their tickets
        Customer[] customers = new Customer[customerInfo.length];
        // loop starts from the index 1 because the first line of the file is not a customer
        for (int i = 1; i < customerInfo.length; i++){
            String name = customerInfo[i][0];
            int numOfTickets = (int) Integer.parseInt(customerInfo[i][1]);
            customers[i-1] = new Customer(name, numOfTickets);
        }
>>>>>>> Stashed changes
        
        try {
            String[][] customers = FileIO.readFile("G3_CENG211_HW1/customers.csv");

            // Example of printing out the customer names and tickets bought
            for (String[] row : customers) {
                System.out.println("Name: " + row[0] + ", Tickets Bought: " + row[1]);
            }
        } catch (FileNotFoundException exception) {
            System.out.println("File not found");
            throw exception;  // Re-throw the exception to be handled in the main method
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
            throw e;  // Ensure IOException is also re-thrown for handling in main method
        }
        Section section = new Section(1);
        section.printPrice(1);

        CustomerManager customerManager = new CustomerManager(100);
        customerManager.printAllCustomersTickets();

        Section section1 = new Section(1);
        System.out.println("Section 1 - Min Price: " + section1.getMinPrice());
        System.out.println("Section 1 - Max Price: " + section1.getMaxPrice());

        Section section2 = new Section(2);
        System.out.println("Section 2 - Min Price: " + section2.getMinPrice());
        System.out.println("Section 2 - Max Price: " + section2.getMaxPrice());
    }

    

    
    


}
