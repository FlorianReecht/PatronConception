package Exercice2;

public class Autres extends  Canard{
    public Autres(ComportementVol cv,ComportementCancan cc)
    {
        super(cv,cc);
    }

    @Override
    public String afficher() {
        return "Autres";

    }
}
