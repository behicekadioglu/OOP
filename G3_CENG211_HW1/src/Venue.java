import java.util.Random;

public class Venue {
    private int numOfSections = 4;
    private Section[] sections;

    // Constructors
    public Venue() {
<<<<<<< Updated upstream
        sections = new Section[numOfSections];
        for (int i = 0; i < numOfSections; i++) {
            sections[i] = new Section(i); // Initialize each section
        }
    }
    public Ticket getAvailableTicket(Section section) {
        Ticket chosenTicket;
        boolean[][] checkedSeats = new boolean[10][60]; // 2D array to track checked seats
        int attempts = 0; // Counter for attempts
        int totalSeats = 10 * 60; // 10 rows, 60 seats per row
=======
        this.numOfSections = 4; // Example value
        this.sections = new Section[numOfSections];
        for (int i = 0; i < numOfSections; i++) {
            this.sections[i] = new Section(i);
        }
    }
>>>>>>> Stashed changes

        // Attempt to find an available ticket
        while (attempts < totalSeats) {
            chosenTicket = getRandomTicket(section, checkedSeats);

            if (chosenTicket == null) {
                return null; // All tickets have been checked and booked
            }

            if (!chosenTicket.isBooked()) {
                return chosenTicket; // Return the available ticket if found
            }

            attempts++; // Increment attempts
        }

        return null; // Return null if no available tickets are found after attempts
    }

    // Method to get a random ticket from the venue for a specific section
    private Ticket getRandomTicket(Section section, boolean[][] checkedSeats) {
        Random random = new Random();
        Ticket[][] ticketsArray = section.getTickets();
        int randomRow, randomSeat;

        // Choose a random unchecked seat
        randomRow = random.nextInt(10);
        randomSeat = random.nextInt(60);

        // If the seat has not been checked, mark it as checked and return the ticket
        if (!checkedSeats[randomRow][randomSeat]) {
            checkedSeats[randomRow][randomSeat] = true;
            return ticketsArray[randomRow][randomSeat];
        }

        return null; // Return null if the seat has already been checked
    }
    

    // Getters and Setters
    public int getNumOfSections() {
        return numOfSections;
    }

    public Section[] getSections() {
        return sections;
    }

    public void setNumOfSections(int numOfSections) {
        this.numOfSections = numOfSections;
    }

    public void setSections(Section[] sections) {
        this.sections = sections;
    }

    
}
