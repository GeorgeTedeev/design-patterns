package com.tedeevgv.patterns.behavioral.template;

public class TemplateClient {
    public static void main(String[] args) {
        FileConverter converter = new ToHtmlFileConverter();
        var htmlFileName = converter.convert("some_name");
        System.out.println("File was converted to html with following name: " + htmlFileName);

        converter = new ToJsonFileConverter();
        var jsonFileName = converter.convert("some_name");
        System.out.println("File was converted to json with following name: " + jsonFileName);
    }
}
