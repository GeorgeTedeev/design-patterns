package com.tedeevgv.patterns.behavioral.template;

public class ToJsonFileConverter extends FileConverter {
    @Override
    protected byte[] parseFile(byte[] content) {
        // json converting imitation
        return "{}".getBytes();
    }

    @Override
    protected String getExtension() {
        return "json";
    }
}
