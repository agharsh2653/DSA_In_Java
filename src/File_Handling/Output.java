package File_Handling;
import java.io.*;
public class Output {
    static void output() {
        // output
        OutputStream os = System.out;
        // os.write(😍); // range is exceeded

        try (OutputStreamWriter osw = new OutputStreamWriter(System.out)) {
            osw.write("Hello World");
            osw.write(97);
            osw.write(10);
            osw.write('A');
            osw.write('\n');
            char[] arr = "hello world".toCharArray();
            osw.write(arr);
            // osw.write(😍);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try {
            FileWriter fw = new FileWriter("note.txt");
            fw.write("hello guess my name");//override in the file
            fw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        output();
    }
}
