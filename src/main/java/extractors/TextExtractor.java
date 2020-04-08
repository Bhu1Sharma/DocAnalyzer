package extractors;

import java.io.File;
import java.io.IOException;

public interface TextExtractor {
    String extract(File file) throws IOException;
}
