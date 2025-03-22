package com.tedeevgv.patterns.creational.prototype;

import java.util.Arrays;

public class ImageElement extends EditorElement {
    private byte[] img;

    public ImageElement(byte[] img) {
        this.img = img;
    }

    @Override
    public EditorElement clone() {
        var imgCopy = new byte[img.length];
        System.arraycopy(img, 0, imgCopy, 0, img.length);
        return new ImageElement(imgCopy);
    }

    @Override
    public void printValue() {
        System.out.println("Content of img is: " + Arrays.toString(img));
    }
}
