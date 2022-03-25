package Exercice2;

public class Prototype  extends Canard{


    public Prototype() {
        super(new Propulsion(),new Cancan() );
    }
    public String afficher()
    {
        return "Je suis un prototype";
    }
}
