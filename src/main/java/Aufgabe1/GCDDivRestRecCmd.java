package Aufgabe1;

public class GCDDivRestRecCmd implements ICommand{

    @Override
    public void execute(){
        Console con = new Console();
        try{
            int a = con.readIntegerFromStdin("Geben sie die 1. Zahl ein: ");
            int b = con.readIntegerFromStdin("Geben sie die 2. Zahl ein: ");
            int c = euklidRekursivModern(a,b);
            System.out.println(toString(c));
        }catch(Exception e){
            System.out.println("Whoopsidoopsie fehler in GCDSubReCmd");
        }

    }
    // algorithmus
    public int euklidRekursivModern(int a,int b){
        if (b==0) {
            return a;
        }
        return euklidRekursivModern(b, a%b);
    }
    //gibt ergebnis als string zurück
    public String toString(int a){
            return "Der ggT nach Euklid Rekursiv Modern ist: "+a;
        }

}
