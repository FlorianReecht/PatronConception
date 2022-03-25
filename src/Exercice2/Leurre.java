package Exercice2;

public class Leurre extends Canard{

    public Leurre() {
        super(new NePasVoler(), new Muer());
    }

    public String afficher()
    {
        return "je suis un Leurre";
    }
}
