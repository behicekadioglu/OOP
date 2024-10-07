public class Venue {
    private int numOfSections;
    private Section[] sections;

    // Constructors


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
