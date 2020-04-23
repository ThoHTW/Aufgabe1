package Aufgabe1;

import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class ConsoleTest {

    @Test
    // Test der eingabe nach beispiel aus ihrem Apptest
    public void readIntegerFromStdintestGut() throws Exception{
        Console con = new Console();
        String data = "20";
        InputStream stdin = System.in;
        try {
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            con.readIntegerFromStdin("irrelevant");
        } finally {
            System.setIn(stdin);
        }
    }

    @Test
    public void readStringFromStdinGut() throws Exception{
        Console con = new Console();
        String data = "Thomas";
        InputStream stdin = System.in;
        try {
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            con.readStringFromStdin("blubb");
        } finally {
            System.setIn(stdin);
        }

    }

}
