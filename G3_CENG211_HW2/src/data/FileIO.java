package data;

public class FileIO {
    private String filePath;

    // No-argument constructor
    public FileIO() {
        this.filePath = "default.txt";
    }

    // Full-argument constructor
    public FileIO(String filePath) {
        this.filePath = filePath;
    }

    // Copy constructor
    public FileIO(FileIO other) {
        this.filePath = other.filePath;
    }

    // Getter and Setter
    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    // toString method
    @Override
    public String toString() {
        return "FileIO{" +
                "filePath='" + filePath + '\'' +
                '}';
    }
    
    // equals method
    public boolean equals(FileIO other) {
        if (other == null) return false;
        return this.filePath.equals(other.filePath);
    }

}
