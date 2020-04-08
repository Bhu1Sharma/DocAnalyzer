import com.docanalyzer.extractors.TextExtractor;
import com.docanalyzer.extractors.TextExtractorFactory;

import java.io.File;
import java.io.IOException;

public class TestClass {

    public static void main(String[] args) throws IOException {
        String fileName = "D:\\readthis.pdf";
        File file = new File(fileName);
        TextExtractor extractor = TextExtractorFactory.getInstance(file);
        String fileContent = extractor.extract();
        System.out.println(fileContent);
    }

}
