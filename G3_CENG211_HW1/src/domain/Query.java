package domain;
public class Query {

    public void findTheSectionWithTheHighestRevenue(Venue venue){
        Section[] sections = venue.getSections();
        double highestRevenue = 0;
        int highestRevenueID = 0;

        for(int i = 0; i < sections.length; i++){
            if (sections[i].calculateRevenue()>highestRevenue){
                highestRevenue = sections[i].calculateRevenue();
                highestRevenueID = i+1;
            }
        }

        System.out.printf("Section with the highest revenue is section %d, and the revenue of this section is %.2f%n", highestRevenueID, highestRevenue);
    }

    public void findTheTotalRevenueOfTheVenue(Venue venue){
        double totalRevenue = venue.calculateRevenue();
        System.out.printf("The total revenue of the venue is: %.2f%n", totalRevenue);
    }

    public void findTheOccupancyRateOfTheVenue(Venue venue){
        double occupancyRate = venue.calculateOccupancyRate() * 100; // Convert to percentage
        System.out.printf("The occupancy rate of the venue is: %.2f%%%n", occupancyRate);
    }

    public void findTheHighetsPaidCustomersTickets(Customer[] customers){
        double highestRevenue = 0;
        String cust = "";
        Ticket[] highestTickets = null;
        for (int i = 0; i < customers.length; i++){
            customers[i].getTotalPrice();

            if (customers[i].getTotalPrice()>highestRevenue){
                highestRevenue = customers[i].getTotalPrice();
                highestTickets = customers[i].getCustTickets();
                cust = customers[i].getCustomerName();
            }
        }

        if (highestTickets != null) {
            System.out.printf("The highest paid customer is: %s with a total payment of: %.2f%n", cust, highestRevenue);
            System.out.println("Tickets bought by the customer: ");
            for (Ticket ticket : highestTickets) {
                System.out.println(ticket);
            }
        } else {
            System.out.println("No customers found.");
        }
    }

    public void findTheMostExpensiveTicket(Venue venue){
        Ticket mostExpensiveTicket = null;
        double highestPrice = 0.0;
    
        for (Section section : venue.getSections()) {
            for (int row = 0; row < section.getNumOfRows(); row++) {
                for (int seat = 0; seat < section.getNumOfSeats(); seat++) {
                    Ticket ticket = section.getTickets()[row][seat];
                    if (ticket.getPrice() > highestPrice) {
                        highestPrice = ticket.getPrice();
                        mostExpensiveTicket = ticket;
                    }
                }
            }
        }
    
        if (mostExpensiveTicket != null) {
            System.out.printf("The most expensive ticket is: %s%nPrice: %.2f%n", mostExpensiveTicket, highestPrice);
        } else {
            System.out.println("No tickets available.");
        }
    }

    public void drawTheVenue(Venue venue){
        Section[] sections = venue.getSections();
        for (Section section : sections) {
            System.out.println("Seat Occupancy of Section " + section.getID() + ":");
            
            // Iterate over each row
            for (int row = 0; row < section.getNumOfRows(); row++) {
                // Iterate over each seat in the row
                for (int seat = 0; seat < section.getNumOfSeats(); seat++) {
                    Ticket ticket = section.getTickets()[row][seat];
    
                    // Print 'X' if the seat is booked, 'O' otherwise
                    if (ticket.isBooked()) {
                        System.out.print("X ");
                    } else {
                        System.out.print("O ");
                    }
                }
                // Move to the next line after printing all seats in the row
                System.out.println();
            }
    
            System.out.println();  // Add space between sections
        }
    }
    
}
