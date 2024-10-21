package domain;

public class Customer {
    private String customerName;
    private int numOfTickets;
    private Ticket[] custTickets;

    // Constructors
    public Customer(String customerName, int numOfTickets) {
        this.setCustomerName(customerName);
        this.setNumOfTickets(numOfTickets);
        // for now initialize an empty array, tickets will be assigned later
        this.custTickets = new Ticket[this.numOfTickets];
    }

    public Customer() {
        this.customerName = "";
        this.numOfTickets = 0;
        this.custTickets = new Ticket[0];
    }

    public Customer(Customer customer) {
        this.setCustomerName(customer.customerName);
        this.setNumOfTickets(customer.numOfTickets);
        this.custTickets = new Ticket[customer.numOfTickets];
        for (int i = 0; i < customer.numOfTickets; i++) {
            this.custTickets[i] = new Ticket(customer.custTickets[i]);
        }
    }

    // Methods
    // calculates the total price of the customers tickets
    public double getTotalPrice(){
        double totalPrice = 0.0;
        for(int i = 0; i < this.numOfTickets; i++){
            totalPrice += custTickets[i].getPrice();
        }
        return totalPrice;
    }

    // Getters and setters
    public String getCustomerName() {
        return customerName;
    }
    public int getNumTickets() {
        return numOfTickets;
    }
    public Ticket[] getCustTickets() {
        return custTickets;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public void setNumOfTickets(int numTickets) {
        this.numOfTickets = numTickets;
    }

    // toString method
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(customerName).append("'s Booked Tickets:\n");
    
        for (int i = 0; i < numOfTickets; i++) {
            Ticket ticket = custTickets[i];
            if (ticket != null) {
                sb.append("Ticket ").append(i + 1).append(": Section: ").append(ticket.getSectionNumber())
                .append(" Row: ").append(ticket.getRowNumber())
                .append(" Seat: ").append(ticket.getSeatNumber())
                .append(" ").append(ticket.getPrice()).append(" TL\n");
            }
        }

        sb.append("Total Price: ").append(getTotalPrice()).append(" TL\n");
        return sb.toString();
}


    // equals method
    public boolean equals(Customer other) {
        if (this == other) return true;
        if (other == null) return false;

        if (this.numOfTickets != other.numOfTickets) return false;
        if (!this.customerName.equals(other.customerName)) return false;

        if (this.custTickets.length != other.custTickets.length) return false;
        for (int i = 0; i < this.custTickets.length; i++) {
            if (!this.custTickets[i].equals(other.custTickets[i])) return false;
        }

        return true;
    }

}

