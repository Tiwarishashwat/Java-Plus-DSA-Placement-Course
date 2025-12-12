import java.io.*;

public class ThrowsDemo {
    public static void main(String[] args) {
        try {
            readFile();   // must handle IOException here
        } catch (IOException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }

    // method declares it might throw IOException
    static void readFile() throws IOException {
        FileReader fr = new FileReader("test.txt"); // may throw FileNotFoundException
        BufferedReader br = new BufferedReader(fr);
        System.out.println(br.readLine());
        br.close();
    }
}
