public class Customer {
    private String customerName;
    private int numOfTickets;
    private Ticket[] bookedTickets;

    // Constructors
    public Customer(String customerName, int numOfTickets) {
        this.customerName = customerName;
        this.numOfTickets = numOfTickets;
        this.bookedTickets = new Ticket[numOfTickets];
    }
    // Getters
    public String getCustomerName() { 
        return customerName; 
    }
    public int getNumTickets() { 
        return numOfTickets; 
    }
    public Ticket[] getBookedTickets() { 
        return bookedTickets; 
    }

    //Setters
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public void setNumTickets(int numTickets) {
        this.numOfTickets = numTickets;
    }
    public void bookTicket(Ticket ticket, int index) {
        bookedTickets[index] = ticket;
        ticket.setBookingStatus(true);
    }
}
