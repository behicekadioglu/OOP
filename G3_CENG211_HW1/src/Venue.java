import java.util.Random;

public class Venue {
    private int numOfSections = 4;
    private Section[] sections;

    // Constructors
    public Venue() {
        sections = new Section[numOfSections];
        for (int i = 0; i < numOfSections; i++) {
            sections[i] = new Section(i); // Initialize each section
        }
    }
    public Ticket getAvailableTicket(Section section) {
        Ticket choosenTicket;

        int attempts = 0; // Counter for attempts
    
        // Attempt to find an available ticket
        while (attempts < 600) { // Try up to 600 times
            choosenTicket = getRandomTicket(section);
            if (!choosenTicket.isBooked()) {
                return choosenTicket; // Return the available ticket if found
            }
            attempts++; // Increment attempts
        }
    
        return null; // Return null if no available tickets are found after 600 attempts
    }

    // Method to get a random ticket from the venue for a specific section
    public Ticket getRandomTicket(Section section) {
        Random random =  new Random();

        Ticket[][] ticketsArray = section.getTickets();
        int randomRow = random.nextInt(10);
        int randomSeat = random.nextInt(60);

        Ticket choosenTicket = ticketsArray[randomRow][randomSeat];
        return choosenTicket;
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
