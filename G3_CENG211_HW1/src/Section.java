<<<<<<< Updated upstream
=======

import java.util.Arrays;
import java.util.Objects;
>>>>>>> Stashed changes
import java.util.Random;
<<<<<<< Updated upstream

=======
>>>>>>> Stashed changes
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


    // Constructors

    public Section(int ID) {
        this.ID = ID;
<<<<<<< Updated upstream
        this.maxPrice = calculateMaxPrice();
        this.minPrice = calculateMinPrice();
        this.tickets = new Ticket[numOfRows][numOfSeats];
    }
=======
        setPriceRange();  // Set price range based on section
        this.numOfRows = 10; // Example value
        this.numOfSeats = 60; // Example value
        this.tickets = new Ticket[numOfRows][numOfSeats]; // Initialize tickets array
        initializeTickets(); // Initialize tickets
    }
    // Section'a göre maksimum ve minimum fiyatları rastgele belirliyoruz

    public void setPriceRange(){
        Random rand = new Random();

        // Max ve Min Price aralıklarını section numarasına göre ayarlıyoruz
        switch (ID) {
            case 0:
                maxPrice = 4000 + rand.nextInt(1001); // [4000, 5001)
                minPrice = 3000 + rand.nextInt(1000); // [3000, 4000)
                break;
            case 1:
                maxPrice = 3500 + rand.nextInt(1001); // [3500, 4501)
                minPrice = 2500 + rand.nextInt(1000); // [2500, 3500)
                break;
            case 2:
                maxPrice = 3000 + rand.nextInt(1001); // [3000, 4001)
                minPrice = 2000 + rand.nextInt(1000); // [2000, 3000)
                break;
            case 3:
                maxPrice = 2500 + rand.nextInt(1001); // [2500, 3501)
                minPrice = 1500 + rand.nextInt(1000); // [1500, 2500)
                break;
            default:
                throw new IllegalArgumentException("Geçersiz section ID");
        }

    }
    // Her satırdaki bilet fiyatlarını belirliyoruz

    public void initializeTickets(){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 60; j++) {
                double price = determinePrice(i);  // Satıra göre fiyat belirleme
                tickets[i][j] = new Ticket(ID, i, j, price); // Bilet oluşturuyoruz
            }
        }

    }
    
    // Satıra göre fiyatları belirleyen method

    private double determinePrice(int row) {
        if (row == 0) {
            return maxPrice; // İlk satırda maksimum fiyat
        } else if (row == 1) {
            return maxPrice * 0.8; // İkinci satırda %80 fiyat
        } else {
            // Diğer satırlarda rastgele bir fiyat (min ve max arasında)
            return minPrice + (Math.random() * (maxPrice - minPrice));
        }
    }

   
>>>>>>> Stashed changes

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

<<<<<<< Updated upstream
    private double generateRandom(int max, int min) {
        Random rand = new Random();
        return rand.nextDouble()*(max-min) + min;
=======
    

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

>>>>>>> Stashed changes
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

<<<<<<< Updated upstream
=======
    public void printPrice(int ID){
        System.out.println("Section ID: " + ID + " Max Price: " + getMaxPrice() + " Min Price: " +  getMinPrice());
    }

<<<<<<< Updated upstream
>>>>>>> Stashed changes
=======
    // toString Method
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Section: ").append(ID).append("\n");
        sb.append("Row: ").append(numOfRows).append("\n");
        sb.append("Seat: ").append(numOfSeats).append("\n");
        sb.append("Max Price: ").append(maxPrice).append("\n");
        sb.append("Min Price: ").append(minPrice).append("\n");
        sb.append("Tickets: \n");
        for (int i = 0; i < numOfRows; i++) {
            for (int j = 0; j < numOfSeats; j++) {
                sb.append(tickets[i][j]).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    @Override
public boolean equals(Object obj) {
    if (this == obj) {
        return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
        return false;
    }
    Section section = (Section) obj;
    return numOfRows == section.numOfRows &&
           numOfSeats == section.numOfSeats &&
           Double.compare(section.maxPrice, maxPrice) == 0 &&
           Double.compare(section.minPrice, minPrice) == 0 &&
           Objects.equals(ID, section.ID) &&
           Arrays.deepEquals(tickets, section.tickets);
}
>>>>>>> Stashed changes
}
