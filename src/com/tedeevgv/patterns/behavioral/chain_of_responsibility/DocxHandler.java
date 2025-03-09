package com.tedeevgv.patterns.behavioral.chain_of_responsibility;

public class DocxHandler extends Handler {
    @Override
    public void process(File file) {
        if (file.getType().equals(FileType.DOCX)) {
            System.out.println("Docx file has been processed!");
        } else {
            forward(file);
        }
    }
}
