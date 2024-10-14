public class Query {

    // Query to find all available tickets in a specific section
    public static Ticket[] findAvailableTicketsInSection(Ticket[] tickets, int sectionNumber) {
        int count = 0;
        for (Ticket ticket : tickets) {
            if (ticket.getSectionNumber() == sectionNumber && !ticket.isBooked()) {
                count++;
            }
        }

        Ticket[] availableTickets = new Ticket[count];
        int index = 0;
        for (Ticket ticket : tickets) {
            if (ticket.getSectionNumber() == sectionNumber && !ticket.isBooked()) {
                availableTickets[index++] = ticket;
            }
        }

        return availableTickets;
    }

    // Query to find all tickets below a certain price
    public static Ticket[] findTicketsBelowPrice(Ticket[] tickets, double maxPrice) {
        int count = 0;
        for (Ticket ticket : tickets) {
            if (ticket.getPrice() <= maxPrice) {
                count++;
            }
        }

        Ticket[] affordableTickets = new Ticket[count];
        int index = 0;
        for (Ticket ticket : tickets) {
            if (ticket.getPrice() <= maxPrice) {
                affordableTickets[index++] = ticket;
            }
        }

        return affordableTickets;
    }

    // Query to count the number of available seats in a section
    public static int countAvailableSeatsInSection(Ticket[] tickets, int sectionNumber) {
        int count = 0;
        for (Ticket ticket : tickets) {
            if (ticket.getSectionNumber() == sectionNumber && !ticket.isBooked()) {
                count++;
            }
        }
        return count;
    }

    // Query to find the most expensive ticket in the venue
    public static Ticket findMostExpensiveTicket(Ticket[] tickets) {
        if (tickets.length == 0) {
            return null;
        }
        Ticket mostExpensiveTicket = tickets[0];
        for (Ticket ticket : tickets) {
            if (ticket.getPrice() > mostExpensiveTicket.getPrice()) {
                mostExpensiveTicket = ticket;
            }
        }
        return mostExpensiveTicket;
    }

    // Query to find the least expensive ticket in the venue
    public static Ticket findLeastExpensiveTicket(Ticket[] tickets) {
        if (tickets.length == 0) {
            return null;
        }
        Ticket leastExpensiveTicket = tickets[0];
        for (Ticket ticket : tickets) {
            if (ticket.getPrice() < leastExpensiveTicket.getPrice()) {
                leastExpensiveTicket = ticket;
            }
        }
        return leastExpensiveTicket;
    }

    // Query to find tickets in a specific row and section
    public static Ticket[] findTicketsInRowAndSection(Ticket[] tickets, int sectionNumber, int rowNumber) {
        int count = 0;
        for (Ticket ticket : tickets) {
            if (ticket.getSectionNumber() == sectionNumber && ticket.getRowNumber() == rowNumber) {
                count++;
            }
        }

        Ticket[] matchingTickets = new Ticket[count];
        int index = 0;
        for (Ticket ticket : tickets) {
            if (ticket.getSectionNumber() == sectionNumber && ticket.getRowNumber() == rowNumber) {
                matchingTickets[index++] = ticket;
            }
        }

        return matchingTickets;
    }

    // Query to check if a specific seat is available (based on section, row, and seat number)
    public static boolean isSeatAvailable(Ticket[] tickets, int sectionNumber, int rowNumber, int seatNumber) {
        for (Ticket ticket : tickets) {
            if (ticket.getSectionNumber() == sectionNumber
                    && ticket.getRowNumber() == rowNumber
                    && ticket.getSeatNumber() == seatNumber
                    && !ticket.isBooked()) {
                return true;
            }
        }
        return false;
    }
}
