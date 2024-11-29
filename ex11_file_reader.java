import java.io.*;

public class ex11_file_reader {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("Demosi.txt")) {
            BufferedReader br = new BufferedReader(reader);
            String message;
            while ((message = br.readLine()) != null) {
                System.out.println(message);
            }

            // int data;
            // while ((data = reader.read()) != -1) {
            //     System.out.print((char) data);
            // }
        } catch (FileNotFoundException e) {
            System.out.println("Error 404: File not found - " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error 505: IO error - " + e.getMessage());
        }
    }
}
