package Aufgabe1;

import org.junit.Assert;
import org.junit.Test;

public class GCDDivRestRecCmdTest {
    @Test
    //test ob das richtige ergebnis herauskommt
    public void gutTest() throws Exception {
        GCDDivRestRecCmd test = new GCDDivRestRecCmd();
        int erhalten = test.euklidRekursivModern(4,20);
        int erwartet = 4;
        Assert.assertEquals(erwartet, erhalten);
    }
}
