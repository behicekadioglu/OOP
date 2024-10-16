import java.io.IOException;

public class TicketBookingApplication {
    public static void main(String[] args) throws IOException{
        // read the customer file to get the names and the number of tickets of the customer
        FileIO io = new FileIO();
        String[][] customerInfo = io.readFile("customers.csv");

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
        
        Query query = new Query();
        query.findTheSectionWithTheHighestRevenue(venue);

    }
}
