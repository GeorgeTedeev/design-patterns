package com.tedeevgv.patterns.behavioral.chain_of_responsibility;

public class XlsxHandler implements Handler {

    private Handler handler;

    @Override
    public void setNextHandler(Handler handler) {
        this.handler = handler;
    }

    @Override
    public void process(File file) {
        if (file.getType().equals(FileType.XLSX)) {
            System.out.println("Xlsx file has been processed!");
        } else if (handler != null) {
            handler.process(file);
        }
        else System.out.printf("File's type: %s is not supported!%n", file.getType());
    }
}
