package com.epam;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.Assert.assertEquals;


public class SampleTestLoggin {
    private static Logger errorLog = Logger.getLogger("ErrorLogger");

    @Rule
    public TestWatcher testWatcher = new TestWatcher() {
        @Override
        protected void failed(Throwable e, Description description) {
            errorLog.debug(description.toString(), e);
            super.failed(e, description);
        }
    };

    private Sample sample;

    @Before
    public void setSample() {
        sample = new Sample();
    }

    @Test
    public void DivTest() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = Sample.class.getDeclaredMethod("Div", Integer.class);
        method.setAccessible(true);
        int result = (Integer) method.invoke(sample, 5, 0);
        assertEquals(5, result);
    }
}
