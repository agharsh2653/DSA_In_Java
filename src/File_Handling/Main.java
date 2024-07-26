package File_Handling;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.*;

public class Main {
    public static void main(String[] args) {

//        try(InputStreamReader isr = new InputStreamReader(System.in)){
//            System.out.print("Enter the letter ");
//            int letter = isr.read();
//            while(isr.ready()){
//                System.out.println((char) letter);
//                letter = isr.read();
//            }
//            isr.close();
//            System.out.println();
//        }catch (IOException e){
//            System.out.println(e.getMessage());
//        }

        try{
            File fo = new File("note.txt");
            fo.createNewFile();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        try(FileReader fr = new FileReader("note.txt")){
            System.out.print("Enter the letter ");
            int letter = fr.read();
            while(fr.ready()){
                System.out.println((char) letter);
                letter = fr.read();
            }
            //fr.close();
            System.out.println();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        // create
        try {
            File fo = new File("new-file.txt");
            fo.createNewFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // write in the file
        try {
            FileWriter fw = new FileWriter("new-file.txt");
            fw.write("सर्वधर्मान्परित्यज्य मामेकं शरणं व्रज, अहं त्वां सर्वपापेभ्यो मोक्षयिष्यामि मा शुच:");
            fw.write("hello my ");
            fw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        // byte to char stream and then reading char stream
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("You typed: " + br.readLine());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // reading from a file
        try (BufferedReader br = new BufferedReader(new FileReader("new-file.txt"))) {
            while (br.ready()) {
                System.out.println(br.readLine());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
