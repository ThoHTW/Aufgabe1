package Aufgabe1;

import org.junit.Assert;
import org.junit.Test;

public class GCDSubItCmdTest {
    @Test
    public void gutTest() throws Exception {
        GCDSubItCmd test = new GCDSubItCmd();
        int erhalten = test.euclidItertivKlassisch(4,20);
        int erwartet = 4;
        Assert.assertEquals(erwartet, erhalten);
    }
}
