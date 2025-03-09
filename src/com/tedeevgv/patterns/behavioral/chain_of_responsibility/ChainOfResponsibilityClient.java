package com.tedeevgv.patterns.behavioral.chain_of_responsibility;

public class ChainOfResponsibilityClient {
    public static void main(String[] args) {
        File xlsxFile = new File(FileType.XLSX);
        File docxFile = new File(FileType.DOCX);
        File pptxFile = new File(FileType.PPTX);

        Handler docxHandler = new DocxHandler();
        Handler xlsxHandler = new XlsxHandler();
        docxHandler.setNextHandler(xlsxHandler);

        docxHandler.process(xlsxFile);
        docxHandler.process(docxFile);
        docxHandler.process(pptxFile);
    }
}
