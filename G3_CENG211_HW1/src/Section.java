public class Section {
    private int ID;
    private int numOfRows;
    private int numOfSeats;
    private double maxPrice;
    private double minPrice;
    private Ticket[][] tickets;


    // Constructors

    
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

    public void setNumOfRows(int numOfRows) {
        this.numOfRows = numOfRows;
    }

    public void setNumOfSeats(int numOfSeats) {
        this.numOfSeats = numOfSeats;
    }

    public void setMaxPrice(double maxPrice) {
        this.maxPrice = maxPrice;
    }

    public void setMinPrice(double minPrice) {
        this.minPrice = minPrice;
    }

    public void setTickets(Ticket[][] tickets) {
        this.tickets = tickets;
    }
}
