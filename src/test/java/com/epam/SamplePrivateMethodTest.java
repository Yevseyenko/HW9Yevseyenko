package com.epam;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class SamplePrivateMethodTest {
    private Sample sample;

    @Before
    public void setSample() {
        sample = new Sample();
    }

    @Test
    public void setNameTest() throws NoSuchMethodException, IllegalAccessException,
            InvocationTargetException {
        Method method = Sample.class.getDeclaredMethod("setName", String.class);
        method.setAccessible(true);
        String name = (String) method.invoke(sample, "Ben");
        assertThat(name.length(), is(3));
    }
}
