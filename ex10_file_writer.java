import java.io.*;

public class ex10_file_writer{
    public static void main(String[] args){
        File f = new File("Demosi.txt");
        try{
            FileWriter writer = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(writer);
            bw.write("JAVA LANGUAGE\n");
            bw.write("Spring Boot\n");
            // writer.write("Hellow World!!\n");
            // writer.write("R U READY\n");
            // writer.close();
            bw.close();
            System.out.println("Writed!!");
        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}