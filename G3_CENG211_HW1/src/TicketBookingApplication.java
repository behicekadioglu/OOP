import java.io.FileNotFoundException;
import java.io.IOException;

public class TicketBookingApplication {
    public static void main(String[] args) throws Exception {
        
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

    }
}
