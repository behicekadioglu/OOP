import java.util.Random;

public class Venue {
    private final int numOfSections = 4;
    private Section[] sections;

    // Constructors
    public Venue() {
        this.createSections();
    }

    // this method creates sections according to the number of sections
    public void createSections(){
        sections = new Section[this.numOfSections];
        for(int i = 0; i < this.numOfSections; i++){
            Section section = new Section(i);
            this.setSection(i, section);
        }
    }

    // this method calculates the total revenue of a venue
    public double calculateRevenue(){
        double totalRevenue = 0.0;
        for(int i = 0; i < this.numOfSections; i++){
            totalRevenue += sections[i].calculateRevenue();
        }
        return totalRevenue;
    }

    // this method calculated the occupancy rate of a venue
    public double calculateOccupancyRate(){
        int totalNumOfSeats = this.numOfSections * this.sections[0].getTotalNumOfSeats();
        int occupantSeats = 0;
        for(int i = 0; i < this.numOfSections; i++){
            occupantSeats += this.sections[i].calculateOccupantSeats();
        }
        double occupancyRate = occupantSeats / (double) totalNumOfSeats;
        return occupancyRate;
    }
    
    // Getters and Setters
    public int getNumOfSections() {
        return numOfSections;
    }

    public Section[] getSections() {
        return sections;
    }

    public void setSection(int ID, Section section) {
        this.sections[ID] = section;
    }
}
