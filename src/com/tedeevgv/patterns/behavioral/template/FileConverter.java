package com.tedeevgv.patterns.behavioral.template;

public abstract class FileConverter {
    public String convert(String fullName) {
        var file = readFile(fullName);
        var parsedFile = parseFile(file);
        return saveFile(parsedFile, fullName);
    }

    protected abstract byte[] parseFile(byte[] content);

    private byte[] readFile(String name) {
        //reading imitation
        return new byte[]{};
    }

    private String saveFile(byte[] content, String fullName) {
        // saving imitation
        var lastDotIndex = fullName.lastIndexOf(".");
        var nameWithoutExtension = lastDotIndex == -1 ? fullName : fullName.substring(lastDotIndex);
        return nameWithoutExtension + "." + getExtension();
    }

    protected abstract String getExtension();
}
