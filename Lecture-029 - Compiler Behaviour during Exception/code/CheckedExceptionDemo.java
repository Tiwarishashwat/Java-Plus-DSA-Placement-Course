import java.io.*;
public class CheckedExceptionDemo {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("test.txt");
        } catch (IOException e) {
            System.out.println("File not found!"); // handled
        }

    }
}