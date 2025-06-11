import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class UsingPaths {

    public static Path rpmLogPath;

    public static void main(String[] args) throws URISyntaxException {
        rpmLogPath = Paths.get(new URI("file:/usr/lib/rpm/rpm.log"));
    }
}
