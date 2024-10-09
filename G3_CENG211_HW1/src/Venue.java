public class Venue {
    private int numOfSections;
    private Section[] sections;

    // Constructors
    public Venue() {
        for (int i = 0; i <4; i++){
            Section section = new Section(i);
            sections[i] = section;
        }
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
