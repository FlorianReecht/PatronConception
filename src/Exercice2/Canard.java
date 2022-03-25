package Exercice2;

public class Canard {
    //Code question 1 en commentaires

    /**
     public String cananer()
     {
     return "coincoin";
     }
     public String nager()
     {
     return "*nage*";
     }
     public String afficher()
     {
     return "canard classique";
     }
     **/
    //Question 2
    ComportementCancan comportementCancan;
    ComportementVol comportementVol;
    public String effectuerCancan()
    {
        return comportementCancan.cacaner();
    }
    public void setComportementCancan(ComportementCancan c)
    {
        comportementCancan=c;
    }
    public  void setComportementVol(ComportementVol c)
    {
        comportementVol=c;
    }

    public String effectuerVol()
    {
        return comportementVol.voler();
    }
    public String nager()
    {
        return "*nage*";
    }
    public String afficher()
    {
        return "canard classique";
    }
    public Canard(ComportementVol cv,ComportementCancan cc)
    {
        comportementVol=cv;
        comportementCancan=cc;
    }

}

