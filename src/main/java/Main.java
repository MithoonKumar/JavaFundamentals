import streams.MyAutoCloseable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
       try {
           testTryWithResource();
       } catch (Exception e) {
           System.out.println("exception " + e);
           System.out.println("suppressed " + e.getSuppressed()[0]);
       }
        try {
            demoSuppressedException("sdsd");
        } catch (Exception e) {
            System.out.println("exception " + e);
            System.out.println("suppressed " + e.getSuppressed()[0]);
        }
    }

    public static void demoSuppressedException(String filePath) throws IOException {
        FileInputStream fileIn = null;
        FileNotFoundException fileNotFoundException = null;
        try {
            fileIn = new FileInputStream(filePath);
        } catch (FileNotFoundException e) {
            fileNotFoundException = e;
            throw  e;
        } finally {
            //throw new ArithmeticException("Some arithmetic exception");
            try {
                fileIn.close();
            } catch (NullPointerException npe) {
                if (fileNotFoundException != null)  {
                    npe.addSuppressed(fileNotFoundException);
                }
                throw npe;
            }
        }
    }

    public static void testThrow() throws Exception {
        System.out.println("first");
        throw new Exception("Custom Exception");
    }

    public static void testTryWithResource() throws Exception {
        try ( MyAutoCloseable myAutoCloseable = new MyAutoCloseable()){
            myAutoCloseable.doSomething();
        } catch (Exception e) {
            throw e;
        }
    }
}
