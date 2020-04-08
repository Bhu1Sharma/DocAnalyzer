package extractors;

import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.io.RandomAccessBufferedFileInputStream;
import org.apache.pdfbox.io.RandomAccessRead;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.File;
import java.io.IOException;

public class PdfTextExtractorImpl implements PdfTextExtractor {

    public String extract(File file) throws IOException {
        RandomAccessRead read = new RandomAccessBufferedFileInputStream(file);
        PDFParser parser = new PDFParser(read);
        parser.parse();
        PDFTextStripper pdfStripper = new PDFTextStripper();
        PDDocument pdDocument = new PDDocument(parser.getDocument());
        return pdfStripper.getText(pdDocument);
    }
}
