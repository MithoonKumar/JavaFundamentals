package streams;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        read();
        write();
    }

    private static void read() throws IOException {
        InputStream inputStream = new FileInputStream("src/main/resources/input.txt");
        int data;
        //The read() method returns a int containing the byte value of the byte read. If there is no more data to be read, the read() method typically returns -1;
        while ((data = inputStream.read()) > 0) {
            System.out.println("length " +  data);
        }
        inputStream.close();
    }

    private static void write() throws IOException {
        OutputStream outputStream = new FileOutputStream("src/main/resources/input.txt");
        //writes a byte array to the file
        outputStream.write("Hello World".getBytes());
        outputStream.close();
    }

}
