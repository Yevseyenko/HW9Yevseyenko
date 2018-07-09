package com.epam;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FileCreationTest {
    private FileCreation fileCreation;

    @Before
    public void settingFile() {
        fileCreation = new FileCreation();
    }

    @Test
    public void fileCreationTest() {
        fileCreation.creationFile("sample.txt");
        assertEquals("sample.txt", fileCreation.getFileName());
    }

}
