package com.docanalyzer.extractors;

import java.io.File;

public abstract class TextExtractorFactory {

    private static final String PDF = "pdf";

    public static TextExtractor getInstance(File file) {
        String fileName = file.getName();
        String fileExtension = fileName.substring(fileName.lastIndexOf(".") + 1);
        if (PDF.equals(fileExtension)) {
            return new PdfTextExtractorImpl(file);
        }
        throw new RuntimeException(String.format("Unsupported File Extension %s", fileExtension));
    }
}
