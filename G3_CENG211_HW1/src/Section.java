import java.util.Random;

public class Section {
    private int ID;
    private final int numOfRows = 10;
    private final int numOfSeats = 60;
    private double maxPrice;
    private double minPrice;
    private Ticket[][] tickets;

    public Section(int ID) {
        this.ID = ID;
        this.tickets = new Ticket[numOfRows][numOfSeats];
        generateTickets(ID); //generates tickets according to the section id
    }

    // Creating every ticket possible in one section
    private void generateTickets(int ID) {
        Random rand = new Random();

        Double maxPrice = getMaxPrice(ID);
        Double minPrice = getMinPrice(ID);

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

                // Create and store ticket in the tickets array
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

    public double getMaxPrice(int ID) {
        return maxPrice = 4000 - ID * 500;
    }

    public double getMinPrice(int ID) {
        return minPrice = 3000 - ID * 500;
    }

    public Ticket[][] getTickets() {
        return tickets;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

}
