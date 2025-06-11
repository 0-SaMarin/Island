import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Tmp {
    public static void main(String[] args) throws IOException {
        byte[] buffer = new byte[1024*1024];
        FileInputStream sourceFile = new FileInputStream("c:\\data.txt");
        FileOutputStream destFile = new FileOutputStream("c:\\output.txt");
        while (true)
        {
            int size = sourceFile.read(buffer); // Read data from a file into a buffer
            destFile.write(buffer, 0, size); // Write data from the buffer to a file

            // Stop copying if the buffer is not full
            if (size < buffer.length) break;
        }
        sourceFile.close();
        destFile.close();
    }
}
