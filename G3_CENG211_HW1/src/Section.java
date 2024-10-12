
import java.util.Random;

public class Section {
    private int ID;
    private final int numOfRows = 10;
    private final int numOfSeats = 60;
    private double maxPrice;
    private double minPrice;
<<<<<<< Updated upstream
    private Ticket[][] tickets;


    // Constructors
    public Section(int ID) {
        this.ID = ID;
        this.maxPrice = calculateMaxPrice();
        this.minPrice = calculateMinPrice();
        this.tickets = generateTickets();
=======
>>>>>>> Stashed changes
    }

    public Section(Section section) {
        this.ID = section.getID();
        this.maxPrice = section.getMaxPrice();
        this.minPrice = section.getMinPrice();
        this.tickets = section.getTickets();
    }
    
    // Methods

<<<<<<< Updated upstream
    private Ticket[][] generateTickets() {
        Double maxPrice = this.maxPrice;
        Double minPrice = this.minPrice;
        double price;

        // Loop through each row and seat to create tickets
        for (int row = 0; row < numOfRows; row++) {
            for (int seat = 0; seat < numOfSeats; seat++) {
                if (row == 0) {
                    price = maxPrice; // First row has maximum price
                } else if (row == 1) {
                    price = maxPrice * 0.8; // Second row has 80% of maximum price
                } else {
                    // Remaining rows get random prices between minPrice and maxPrice
                    price = generateRandom(maxPrice, minPrice);
                }
                // Create and store ticket in the tickets array
                tickets[row][seat] = new Ticket(ID, row, seat, price);
            }
        }
        return tickets;
    }

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

    private double generateRandom(double max, double min) {
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
}
