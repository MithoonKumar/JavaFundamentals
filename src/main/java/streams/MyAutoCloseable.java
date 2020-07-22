package streams;

import java.io.Closeable;
import java.io.IOException;

public class MyAutoCloseable implements Closeable {

    public void doSomething() throws Exception {
        throw new Exception("Exception while doing something");
    }

    @Override
    public void close() throws IOException {
        throw new IOException("Exception while closing file");
    }
}
