package Exercice2;

public class Mandarin  extends  Canard{
    @Override
    public String afficher() {
        return "Mandarin";
    }
    public Mandarin()
    {
        super(new Vol(),new Cancan());
    }

}
