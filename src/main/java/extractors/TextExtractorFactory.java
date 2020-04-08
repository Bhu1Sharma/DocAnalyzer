package extractors;

import java.io.File;

public abstract class TextExtractorFactory {

    private static final String PDF = "pdf";

    public static TextExtractor getInstance(String fileExtension) {
        if (PDF.equals(fileExtension)) {
            return new PdfTextExtractorImpl();
        }
        throw new RuntimeException(String.format("Unsupported File Extension %s", fileExtension));
    }
}
