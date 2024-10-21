package domain;

public class Venue {
    private int numOfSections;
    private Section[] sections;

    // Constructors
    public Venue() {
        this.numOfSections = 4;
        this.createSections();
    }

    public Venue(int numOfSections) {
        this.numOfSections = numOfSections;
        this.createSections();
    }

    public Venue(Venue venue) {
        this.numOfSections = venue.numOfSections;
        this.sections = new Section[venue.numOfSections];
        for (int i = 0; i < venue.numOfSections; i++) {
            this.sections[i] = new Section(venue.sections[i]);
        }
    }

    // methods
    // this method creates sections according to the number of sections
    public void createSections(){
        sections = new Section[this.numOfSections];
        for(int i = 0; i < this.numOfSections; i++){
            Section section = new Section(i);
            sections[i] = section;
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
    // it returns the exact same section without copy it, because we need to work on the exactly same section
    public Section getSection(Venue venue, int sectionID){
        Section section =  venue.getSections()[sectionID];
        return section;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Venue with ").append(numOfSections).append(" sections:\n");

        for (int i = 0; i < numOfSections; i++) {
            sb.append("Section ").append(i).append(":\n");
            sb.append(sections[i].toString()).append("\n");
        }

        sb.append("Total Revenue: ").append(calculateRevenue()).append("\n");
        sb.append("Occupancy Rate: ").append(calculateOccupancyRate() * 100).append("%\n");
    
        return sb.toString();
}


    public boolean equals(Venue other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        if (this.numOfSections != other.numOfSections) {
            return false;
        }
        for (int i = 0; i < this.numOfSections; i++) {
            if (!this.sections[i].equals(other.sections[i])) {
                return false;
            }
        }
        return true;
    }
}
