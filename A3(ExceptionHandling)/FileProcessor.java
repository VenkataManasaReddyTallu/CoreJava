import java.util.*;
import java.io.*;
//File Processing with Try-with-Resources & Custom Exception
class InvalidFileException extends Exception {
    public InvalidFileException(String message) {
        super(message);
    }
}

class FileProcessor {
    public static void readFile(String filePath) throws InvalidFileException {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            throw new InvalidFileException("File not found: " + filePath);
        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }
    public static void main(String[] args) {
        try {
            readFile("sample.txt");
        } catch (InvalidFileException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}