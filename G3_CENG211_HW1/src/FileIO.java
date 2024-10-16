import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileIO {

    // reads a CSV file and returns an array that has customer names and number of tickets
    public String[][] readFile(String filename) throws IOException {

        // get the number of lines in the file
        int numOfLines = countLines(filename);
        
        String[][] customers = new String[numOfLines][];  // Initialize the array with the line count

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;

            int lineNum = 0;

            // read each line and then split by comma to seperate names and number of tickets
            while ((line = reader.readLine()) != null) {
                customers[lineNum] = line.split(",");
                lineNum++;
            }

            reader.close();
        
        } catch (FileNotFoundException exception) {
            System.out.println("File not found: " + filename);
        }

        return customers;
    }

    // counts the lines in a csv file
    private static int countLines(String filename) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader(filename));

        int lines = 0;
        while (reader.readLine() != null) {
            lines++;
        }

        reader.close();
        return lines;
    }
}


