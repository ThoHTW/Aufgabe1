package Aufgabe1;

public class GCDSubItCmd implements ICommand{

    @Override
    public void execute(){
        Console con = new Console();
        try{
            int a = con.readIntegerFromStdin("Geben sie die 1. Zahl ein: ");
            int b = con.readIntegerFromStdin("Geben sie die 2. Zahl ein: ");
            int c = euclidItertivKlassisch(a,b);
            System.out.println(toString(c));

        }catch(Exception e){
            System.out.println("Whoopsidoopsie fehler in GCDSubReCmd");
        }
    }
    // algorithmus
    public int euclidItertivKlassisch(int a, int b){
        if (a==0){
            return b;
        }
        while (b!=0){
            if (a > b){
                a = a-b;
            }else b = b-a;
        }
        return a;
    }
    //gibt ergebnis als string zurück
    public String toString(int a){
        return "Der ggT nach Euklid Iterativ klassisch ist: "+a;
    }
}
