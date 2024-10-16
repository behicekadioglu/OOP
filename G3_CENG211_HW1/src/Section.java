import java.util.Random;

public class Section {
    private int ID;
    private final int numOfRows = 10;
    private final int numOfSeats = 60;
    private double maxPrice;
    private double minPrice;

    // Constructors
    public Section(int ID) {
        this.setID(ID);
        this.determineMaxPrice(ID);
        this.determineMinPrice(ID);
        this.setTickets(this.createTickets());
    }

    public Section(Section section) {
        this.ID = section.getID();
        this.maxPrice = section.getMaxPrice();
        this.minPrice = section.getMinPrice();
        this.tickets = section.getTickets();
    }

    // Methods
    // gives a random double number in the range of max and min, max is not included
    private double generateRandomDouble(double min, double max) {
        Random rand = new Random();
        return rand.nextDouble()*(max-min) + min;
    }

    // generates a random max price for the section according to the section ID
    // This method is written according to the threshold values that are given in the homework description
    private double determineMaxPrice(int ID) {
        double localMaxPrice = 0.0;
        switch (ID) {
            case 0:
                {
                    int max = 5001;
                    int min = 4000;
                    localMaxPrice = generateRandomDouble(min, max);
                    break;
                }
            case 1:
                {
                    int max = 4501;
                    int min = 3500;
                    localMaxPrice = generateRandomDouble(min, max);
                    break;
                }
            case 2:
                {
                    int max = 4001;
                    int min = 3000;
                    localMaxPrice = generateRandomDouble(min, max);
                    break;
                }
            case 3:
                {
                    int max = 3501;
                    int min = 2500;
                    localMaxPrice = generateRandomDouble(min, max);
                    break;
                }
            default:
                {
                    System.out.println("Invalid ID");
                    break;
                }
        }
        return localMaxPrice;
    }

    // generates a random min price for the section according to the section ID
    // This method is written according to the threshold values that are given in the homework description
    private double determineMinPrice(int ID) {
        double localMinPrice = 0.0;
        switch (ID) {
            case 0:
                {
                    int max = 4000;
                    int min = 3000;
                    localMinPrice = generateRandomDouble(min, max);
                    break;
                }
            case 1:
                {
                    int max = 3500;
                    int min = 2500;
                    localMinPrice = generateRandomDouble(min, max);
                    break;
                }
            case 2:
                {
                    int max = 3000;
                    int min = 2000;
                    localMinPrice = generateRandomDouble(min, max);
                    break;
                }
            case 3:
                {
                    int max = 2500;
                    int min = 1500;
                    localMinPrice = generateRandomDouble(min, max);
                    break;
                }
            default:
                break;
        }
        return localMinPrice;
    }

    // creates all tickets of the section with random prices
    private Ticket[][] createTickets() {
        Ticket[][] tickets = new Ticket[this.numOfRows][this.numOfSeats];
        for(int row = 0; row < this.numOfRows; row++){
            for(int seat = 0; seat < this.numOfSeats; seat++){
                double price = 0.0;
                if (row == 0) {
                    price = this.maxPrice;
                } else if (row == 1) {
                    price = this.maxPrice * 0.8;
                } else {
                    price = generateRandomDouble(this.minPrice, this.maxPrice);
                }
                tickets[row][seat] = new Ticket(this.ID, row, seat, price);
            }
        }
        return tickets;

    }

    // this method calculates the total revenue of a section
    public double calculateRevenue(){
        double totalRevenue = 0.0;
        for(int row = 0; row < this.numOfRows; row++){
            for(int seat = 0; seat < this.numOfSeats; seat++){
                if (this.tickets[row][seat].isBooked()){
                    totalRevenue += tickets[row][seat].getPrice();
                }
            }
        }
        return totalRevenue;
    }

    // this method calculated the occupancy rate of a section
    public int calculateOccupantSeats(){
        int occupantSeats = 0;
        for(int row = 0; row < this.numOfRows; row++){
            for(int seat = 0; seat < this.numOfSeats; seat++){
                if (this.tickets[row][seat].isBooked()){
                    occupantSeats += 1;
                }
            }
        }
        return occupantSeats;
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

    public int getTotalNumOfSeats() {
        return numOfRows*numOfSeats;
    }

    public void setID(int ID) {
        if (ID < 4 && ID >= 0) {
            this.ID = ID;
        } else {
            System.out.println("Invalid ID");
        }
    }

    public void setTickets(Ticket[][] tickets) {
        this.tickets = tickets;
    }
    
    // sets one ticket in its place in the tickets array
    public void setTicket(int row, int seat, Ticket ticket){
        this.tickets[row][seat] = ticket;
    }
}
