package com.github.tcking;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.FileInputStream;

import org.junit.Before;
import org.junit.Test;

public class PlaceHolderPropertiesTest {
	private PlaceHolderProperties placeHolderProperties=new PlaceHolderProperties();


    @Before
    public void setUp() throws Exception {
        placeHolderProperties.load(new FileInputStream(new File("/Users/tc/work/tmp/test.properties")));
    }

    @Test
    public void testGetProperty() throws Exception {
        String test = placeHolderProperties.getProperty("image_cache");
        System.out.println(test);
        assertEquals("/giraffe/cache/imageCache",test);
    }

}
