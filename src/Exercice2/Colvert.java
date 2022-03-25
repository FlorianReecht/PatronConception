package Exercice2;

public class Colvert extends  Canard{

    public Colvert() {
        super(new Vol(),new Cancan());
    }

    @Override
    public String afficher() {
        return "Colvert";
    }
}
