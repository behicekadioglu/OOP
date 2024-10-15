import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileIO {
    


    // Reads a CSV file and returns a two-dimensional array
    public static String[][] readFile(String filename) throws IOException {

        int lineCount = countLines(filename);  // First, count the lines
        
        String[][] array = new String[lineCount][];  // Initialize the array with the line count

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            int index = 0;

            // Read each line and split by comma
            while ((line = reader.readLine()) != null) {
                array[index] = line.split(",");  // Split each line by commas and store in array
                index++;
            }

            reader.close(); 
            
        } catch (FileNotFoundException exception) {
            System.out.println("File not found: " + filename);
        }

        return array;  // Return the 2D array
    }

    // Static method to count the number of lines in the file
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


