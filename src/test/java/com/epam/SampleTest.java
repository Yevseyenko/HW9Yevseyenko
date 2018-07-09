package com.epam;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SampleTest {

  private Sample sample;

    @Before
    public void setSample() {
        sample = new Sample();
    }

    @Test
    public void addTest() {

        assertEquals(12, sample.Add(12, 0));
    }



    @Test
    public void isNamePresentedTest() {
        assertTrue("Name isnt presented", sample.isNamePresented() == false);
    }

    @Test
    public void ArrayNameTest() {
        String[] arrayNames = {"John", "Ben", "Michael"};
        assertArrayEquals(arrayNames, sample.getNames());
    }
}
