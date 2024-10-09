import java.util.Random;

public class Section {
    private int ID;
    private final int numOfRows = 10;
    private final int numOfSeats = 60;
    private double maxPrice;
    private double minPrice;
    private Ticket[][] tickets;

    // Constructor with section ID
    public Section(int ID) {
        this.ID = ID;
        this.maxPrice = 4000 - this.ID * 500; // Set max price based on section ID
        this.minPrice = 3000 - this.ID * 500; // Set min price based on section ID
        this.tickets = new Ticket[numOfRows][numOfSeats]; // Initialize the ticket array
        generateTickets(); // Generate tickets for the section
    }

    // Creating every ticket possible in one section
    private void generateTickets() {
        Random rand = new Random();

        // Loop through each row and seat to create tickets
        for (int row = 0; row < numOfRows; row++) {
            for (int seat = 0; seat < numOfSeats; seat++) {
                double price;

                // First row has maximum price
                if (row == 0) {
                    price = maxPrice;
                } 
                // Second row has 80% of maximum price
                else if (row == 1) {
                    price = maxPrice * 0.8;
                } 
                // Remaining rows get random prices between minPrice and maxPrice
                else {
                    price = minPrice + (maxPrice - minPrice) * rand.nextDouble();
                }

                // Create and store the ticket in the tickets array
                tickets[row][seat] = new Ticket(ID, row, seat, price);
            }
        }
    }

    // Getters and Setters
    public int getID() {
        return ID;
    }

    public int getNumOfRows() {
        return numOfRows;
    }

    public int getNumOfSeats() {
        return numOfSeats;
    }

    public double getMaxPrice() {
        return maxPrice;
    }

    public double getMinPrice() {
        return minPrice;
    }

    public Ticket[][] getTickets() {
        return tickets;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}

