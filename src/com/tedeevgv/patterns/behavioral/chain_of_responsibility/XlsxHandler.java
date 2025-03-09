package com.tedeevgv.patterns.behavioral.chain_of_responsibility;

public class XlsxHandler extends Handler {
    @Override
    public void process(File file) {
        if (file.getType().equals(FileType.XLSX)) {
            System.out.println("Xlsx file has been processed!");
        } else {
            forward(file);
        }
    }
}
