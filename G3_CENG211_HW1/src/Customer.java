import java.util.Random;

public class Customer {
    private String customerName;
    private int numOfTickets;
    private Ticket[] custTickets;

    // Constructors
    public Customer(String customerName, int numOfTickets) {
        this.setCustomerName(customerName);
        this.setNumOfTickets(numOfTickets);
        // number of sections, rows, and seats are given hard coded as the numbers in the homework description
        assignCustTickets(numOfTickets, 4, 10, 60);
    }

    // Methods

    // gives a random int number in the range of max and min, max is not included
    private int generateRandomInt(int min, int max){
        Random rand = new Random();
        return rand.nextInt(min, max);
    }

    // determines tickets of the customer randomly in a random section
    // if the ticket is already booked chooses another random ticket from the same section
    private void assignCustTickets(int numOfTickets, int numOfSections,int numOfRows, int numOfSeats){
        this.custTickets = new Ticket[numOfTickets];
        int randSectionID = generateRandomInt(0, numOfSections);
        for(int i = 0; i < numOfTickets; i++){
            int randRow = generateRandomInt(0, numOfRows);
            int randSeat = generateRandomInt(0, numOfSeats);
            Ticket ticket = new Ticket(randSectionID, randRow, randSeat);
            while(ticket.isBooked()){
                randRow = generateRandomInt(0, numOfRows);
                randSeat = generateRandomInt(0, numOfSeats);
                ticket = new Ticket(randSectionID, randRow, randSeat);
            }
            this.custTickets[i] = ticket;
        }
    }

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

}
