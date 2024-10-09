
import java.util.Random;

public class Section {
    private int ID;
    private int numOfRows = 10;
    private int numOfSeats = 600;
    private double maxPrice;
    private double minPrice;
    private Ticket[][] tickets;


    // Constructors
    public Section(int ID) {
        this.ID = ID;
        this.maxPrice = calculateMaxPrice();
        this.minPrice = calculateMinPrice();
        this.tickets = new Ticket[numOfRows][numOfSeats];
    }

    public Section(Section section) {
        this.ID = section.getID();
        this.numOfRows = section.getNumOfRows();
        this.numOfSeats = section.getNumOfSeats();
        this.maxPrice = section.getMaxPrice();
        this.minPrice = section.getMinPrice();
        this.tickets = section.getTickets();
    }
    
    // Methods

    private double calculateMaxPrice() {
        double localMaxPrice = 0.0;
        switch (this.ID) {
            case 0:
                {
                    int max = 5001;
                    int min = 4000;
                    localMaxPrice = generateRandom(max, min);
                    break;
                }
            case 1:
                {
                    int max = 4501;
                    int min = 3500;
                    localMaxPrice = generateRandom(max, min);
                    break;
                }
            case 2:
                {
                    int max = 4001;
                    int min = 3000;
                    localMaxPrice = generateRandom(max, min);
                    break;
                }
            case 3:
                {
                    int max = 3501;
                    int min = 2500;
                    localMaxPrice = generateRandom(max, min);
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

    private double calculateMinPrice() {
        double localMinPrice = 0.0;
        switch (this.ID) {
            case 0:
                {
                    int max = 4000;
                    int min = 3000;
                    localMinPrice = generateRandom(max, min);
                    break;
                }
            case 1:
                {
                    int max = 3500;
                    int min = 2500;
                    localMinPrice = generateRandom(max, min);
                    break;
                }
            case 2:
                {
                    int max = 3000;
                    int min = 2000;
                    localMinPrice = generateRandom(max, min);
                    break;
                }
            case 3:
                {
                    int max = 2500;
                    int min = 1500;
                    localMinPrice = generateRandom(max, min);
                    break;
                }
            default:
                break;
        }
        return localMinPrice;
    }

    private double generateRandom(int max, int min) {
        Random rand = new Random();
        return rand.nextDouble()*(max-min) + min;
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
        if (ID < 4 && ID >= 0) {
            this.ID = ID;
        } else {
            System.out.println("Invalid ID");
        }
    }

    public void setTickets(Ticket[][] tickets) {
        this.tickets = tickets;
    }

}
