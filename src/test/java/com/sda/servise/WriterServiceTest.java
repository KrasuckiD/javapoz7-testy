package com.sda.servise;

import com.sda.service.WriterService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WriterServiceTest {
    private WriterService writerService;

    @Before
    public void init (){
        this.writerService = new WriterService();
    }

    @Test
    public void testOneName (){

    String name = "Szymon";

    String result = writerService.write(name);

    Assert.assertEquals("Hello, Szymon.", result);
    }

    @Test
    public void testNullName (){

        String name = null;

        String result = writerService.write(name);

        Assert.assertEquals("Hello, my friend.", result);
    }

    @Test
    public void testCapitalisedName (){

        String name = "SZYMON";

        String result = writerService.write(name);

        Assert.assertEquals("HELLO, SZYMON!", result);
    }

    @Test
    public void testEmptyName () {

        String name = "";

        String result = writerService.write(name);

        Assert.assertEquals("Hello, my friend.", result);
    }

    @Test
    public void testBlankName () {

        String name = "  ";

        String result = writerService.write(name);

        Assert.assertEquals("Hello, my friend.", result);
    }

    @Test
    public void testMultiName () {

        String name = "Szymon, Anna, Jan";

        String result = writerService.write(name);

        Assert.assertEquals("Hello, Szymon, Anna and Jan.", result);
    }

    @Test
    public void testCapitalizeMultiName () {

        String name = "SZYMON, ANNA, JAN";

        String result = writerService.write(name);

        Assert.assertEquals("HELLO, SZYMON, ANNA AND JAN!", result);
    }
}
