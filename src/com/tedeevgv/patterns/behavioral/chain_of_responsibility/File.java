package com.tedeevgv.patterns.behavioral.chain_of_responsibility;

public class File {
    private FileType type;

    public File(FileType type) {
        this.type = type;
    }

    public FileType getType() {
        return type;
    }
}
