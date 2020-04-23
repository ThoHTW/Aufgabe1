package Aufgabe1;

import org.junit.Assert;
import org.junit.Test;

public class GCDSubReCmdTest {

    @Test
    public void gutTest() throws Exception{
        GCDSubReCmd test = new GCDSubReCmd();
        int erhalten = test.euclidRekursivKlassich(4,20);
        int erwartet = 4;
        Assert.assertEquals(erhalten,erwartet);
    }
}
