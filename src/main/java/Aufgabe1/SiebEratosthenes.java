package Aufgabe1;

public class SiebEratosthenes implements ICommand {

    @Override
    public void execute(){
        Console con = new Console();
        try{
            int a = con.readIntegerFromStdin("Geben sie die 1. Zahl ein: ");
            toString();
            siebEratosthenes(a);
        }catch(Exception e){
            System.out.println("Whoopsiedoopsie fehler in GCDSubReCmd");
        }

    }
    //algorithmus ergebnis wird schon hier ausgegeben
    public void siebEratosthenes(int a){
        if (a < 2) {
            a = 2;
        }
        boolean[] isPrim = new boolean[a + 1];
        for (int i = a; i >= 2; i--) { // mit true initialisieren
            isPrim[i] = true;
        }
        for (int i = 2; i * i <= a; i++) {
            if (isPrim[i]) {
                int nextNotPrim = i + i;
                while (nextNotPrim <= a) {
                    isPrim[nextNotPrim] = false;
                    nextNotPrim += i;
                }
            }
        }
        for(int j = 1; j < isPrim.length; j++ ){
            if(isPrim[j]) System.out.print(j+" ");
        }
    }
    //gibt text vor ausgabe des ergebnis zurück
    public String toString(){
        return "Die folgenden Zahlen sind Primzahlen: ";
    }
}
