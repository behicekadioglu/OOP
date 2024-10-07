public class Customer {
    private String name;
    private int numOfBookedTickets;
    private Ticket[] tickets;

    // Constructors

    // Getters and Setters
    public String getName() {
        return name;
    }

    public int getNumOfBookedTickets() {
        return numOfBookedTickets;
    }

    public Ticket[] getTickets() {
        return tickets;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumOfBookedTickets(int numOfBookedTickets) {
        this.numOfBookedTickets = numOfBookedTickets;
    }

    public void setTickets(Ticket[] tickets) {
        this.tickets = tickets;
    }
}
