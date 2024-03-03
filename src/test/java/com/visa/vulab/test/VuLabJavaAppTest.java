package com.visa.vulab.test;

import org.junit.jupiter.api.Test;

import com.visa.vulab.VuLabJavaApp;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VuLabJavaAppTest
{
    @Test
    public void testAppConstructor() {
        VuLabJavaApp app1 = new VuLabJavaApp();
        VuLabJavaApp app2 = new VuLabJavaApp();
        assertEquals(app1.getMessage(), app2.getMessage());
    }

    @Test
    public void testAppMessage()
    {
        VuLabJavaApp app = new VuLabJavaApp();
        assertEquals("Visa Rocks!", app.getMessage());
    }
}
