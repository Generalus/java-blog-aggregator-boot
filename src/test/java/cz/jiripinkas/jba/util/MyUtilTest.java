package cz.jiripinkas.jba.util;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyUtilTest {

    @Test
    public void testGetPublicName() throws Exception {
        assertEquals("tester (Test Test)", MyUtil.getPublicName("tester", "Test Test", false));
        assertEquals("Test Test", MyUtil.getPublicName(null, "Test Test", false));
        assertEquals("Test Test", MyUtil.getPublicName("", "Test Test", false));
        assertEquals("loooooooooooooooo ... (Test Test)", MyUtil.getPublicName("looooooooooooooooooooooooooong nick", "Test Test", true));
        assertEquals("looooooooooooooooooooooooooong nick (Test Test)", MyUtil.getPublicName("looooooooooooooooooooooooooong nick", "Test Test", false));
    }

}
