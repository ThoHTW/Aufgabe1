package Aufgabe1;

public class GCDDivRestItCmd implements ICommand{

    @Override
    public void execute(){
        Console con = new Console();
        try{
            int a = con.readIntegerFromStdin("Geben sie die 1. Zahl ein: ");
            int b = con.readIntegerFromStdin("Geben sie die 2. Zahl ein: ");
            int c = euclidIterativModern(a,b);
            System.out.println(toString(c));
        }catch(Exception e){
            System.out.println("Whoopsidoopsie fehler in GCDSubReCmd");
        }

    }

    public int euclidIterativModern(int a, int b){
        while(b != 0){
            int h = a%b;
            a = b;
            b = h;
        }
        return a;
    }
    public String toString(int a){
        return "Der ggT nach Euklid Iterativ Modern ist: "+a;
    }
}
