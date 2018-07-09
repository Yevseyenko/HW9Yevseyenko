package com.epam;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SampleTest2 {
    private Sample sample;
    @Before
    public void setSample() {
        sample = new Sample();
    }
    @Test
    public void ArrayNameTest() {
        String[] arrayNames = {"John", "Ben", "Michael","Frank"};
        assertArrayEquals(arrayNames, sample.addNames());
    }
}
