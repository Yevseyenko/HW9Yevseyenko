package com.epam;

import java.io.File;

public class FileCreation {
    String fileName;

    public void creationFile(String name) {
        this.fileName = name;
        File file = new File(name);
    }

    public String getFileName() {
        return fileName;
    }
}