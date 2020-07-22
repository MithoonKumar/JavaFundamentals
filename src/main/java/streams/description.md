 * Streams in java is an ordered sequence of data.
 * Streams are unidirectional. This means that once a stream is created it can either be used for reading or writing.
 * Streams are of 2 categories.
    a). Binary streams
    b). Text streams (Interact as Unicode characters)
 * Base class to read binary data from streams is `InputStream`.
 * Base class to read text data from streams is `Reader`.
 * Methods in `InputStream` class
    int read ()
    int read (byte [] buff)
 * Methods in `Reader` class
    int read ()
    int read (char[] buff)
 * For writing streams there are 2 abstract classes: `OutputStream` and `Writer`
 * There are several implementations of these abstract classes
 InputStream: ByteArrayInputStream, PipedInputStream, FileInputStream
 OutputStream: ByteArrayOutputStream, PipedOutputStream, FileOutputStream
 Reader: CharArrayReader, StringReader, PipedReader, InputStreamReader
 Writer: CharArrayWriter, StringWriter, PipedWriter, OutputStreamWriter