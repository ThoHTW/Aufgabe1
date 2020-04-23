package Aufgabe1;

import org.junit.Assert;
import org.junit.Test;

public class GCDDivRestItCmdTest {

    @Test
    //test ob das richtige ergebnis herauskommt
    public void gutTest() throws Exception {
        GCDDivRestItCmd test = new GCDDivRestItCmd();
        int erhalten = test.euclidIterativModern(4, 20);
        int erwartet = 4;
        Assert.assertEquals(erwartet, erhalten);
    }
}
