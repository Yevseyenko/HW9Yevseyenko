package com.epam;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.Assert.*;
public class SamplePrivateMethodTest2 {
    private Sample sample;

    @Before
    public void setSample() {
        sample = new Sample();
    }
    @Test
    public void DivTest()throws NoSuchMethodException,IllegalAccessException,
            InvocationTargetException {
        Method method =Sample.class.getDeclaredMethod("Div",Integer.class);
        method.setAccessible(true);
        int result = (Integer)method.invoke(sample,10,2);
        assertEquals(5,result);
    }

}
