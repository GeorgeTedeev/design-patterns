package com.tedeevgv.patterns.behavioral.template;

public class ToHtmlFileConverter extends FileConverter {
    @Override
    protected byte[] parseFile(byte[] content) {
        // html converting imitation
        return "<!DOCTYPE html> <html lang=\"en\"> </html>".getBytes();
    }

    @Override
    protected String getExtension() {
        return "html";
    }
}
