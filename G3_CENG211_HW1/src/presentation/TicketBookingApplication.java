package presentation;

import data.FileIO;
import domain.Customer;
import domain.Query;
import domain.Section;
import domain.Ticket;
import domain.Venue;
import java.io.IOException;
import java.util.Random;

public class TicketBookingApplication {
    public static void main(String[] args) throws IOException{
        // create the venue, it will create everything about the venue for the program
        Venue venue = new Venue();

        // create the customers without tickets
        Customer[] customers = createCustomersFromFile("customers.csv");

        // this method assign random avaliable tickets to each customer
        assignTickets(customers, venue);

        System.out.println(venue.getSection(venue,1).calculateRevenue());
        // this method makes the calls for queries
        callQuery(venue);
    }

    private static Customer[] createCustomersFromFile(String fileLocation) throws IOException{
        FileIO io = new FileIO();
        // read the customer file to get the names and the number of tickets of the customer
        String[][] customerInfo = io.readFile(fileLocation);
        // create the customers and book their tickets
        Customer[] customers = new Customer[customerInfo.length - 1];
        for (int i = 0; i < customers.length; i++){
            String custName = customerInfo[i+1][0];
            int custTicketNum = Integer.parseInt(customerInfo[i+1][1]);
            customers[i] = new Customer(custName, custTicketNum);
        }
        return customers;
    }

    private static void assignTickets(Customer[] customers, Venue venue){
        Random rand = new Random();
        Section[] sections = venue.getSections();
        for (int i = 0; i < customers.length; i++){
            Ticket[] custTickets = customers[i].getCustTickets();
            int sectionID = rand.nextInt(sections.length);
            Section sectionForCustomer = sections[sectionID];
            for (int j = 0; j < customers[i].getNumTickets(); j++){
                int randRow = rand.nextInt(sectionForCustomer.getNumOfRows());
                int randSeat = rand.nextInt(sectionForCustomer.getNumOfSeats());
                Ticket randTicket = sectionForCustomer.getTicket(randRow, randSeat);
                while (randTicket.isBooked()){
                    randRow = rand.nextInt(sectionForCustomer.getNumOfRows());
                    randSeat = rand.nextInt(sectionForCustomer.getNumOfSeats());
                    randTicket = sectionForCustomer.getTicket(randRow, randSeat);
                }
                randTicket.bookTicket();
                custTickets[j] = randTicket;
            }
        }
    }

    private static void callQuery(Venue venue){
        Query query = new Query();
        query.findTheSectionWithTheHighestRevenue(venue);
        query.findTheTotalRevenueOfTheVenue(venue);
        query.findTheOccupancyRateOfTheVenue(venue);
        query.findTheHighetsPaidCustomersTickets(venue);
        query.findTheMostExpensiveTicket(venue);
        query.drawTheSection(venue);
    }
}
