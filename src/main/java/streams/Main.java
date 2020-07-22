package streams;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {

    public static void main(String[] args) throws IOException {
        InputStream inputStream = new FileInputStream("src/main/resources/input.txt");
        int data;
        //The read() method returns a int containing the byte value of the byte read. If there is no more data to be read, the read() method typically returns -1;
        while ((data = inputStream.read()) > 0) {
            System.out.println("length " +  data);
        }
    }
}
