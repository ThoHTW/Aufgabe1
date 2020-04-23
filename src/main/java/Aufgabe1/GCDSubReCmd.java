package Aufgabe1;

public class GCDSubReCmd implements ICommand {


    @Override
    public void execute(){
        Console con = new Console();
        try{
            int a = con.readIntegerFromStdin("Geben sie die 1. Zahl ein: ");
            int b = con.readIntegerFromStdin("Geben sie die 2. Zahl ein: ");
            int c = euclidRekursivKlassich(a,b);
            System.out.println(toString(c));
        }catch(Exception e){
            System.out.println("Whoopsidoopsie fehler in GCDSubReCmd");
        }

    }
    // algorithmus
    public int euclidRekursivKlassich(int a, int b){
        if(b == 0) return a;
        else if (a == 0) return b;
        else if (a > b) return euclidRekursivKlassich(a-b, b);
        else return euclidRekursivKlassich(a, b-a);
    }
    //gibt ergebnis als string zurück
    public String toString(int a){
        return "Der ggT nach Euklid Rekursiv klassisch ist: "+a;
    }
}
