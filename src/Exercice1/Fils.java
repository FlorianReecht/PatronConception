package Exercice1;

public class Fils {
    Pere pere;
    String prenom;
    public void setPere(Pere p)
    {
        pere=p;
    }
    public String getPrenom()
    {
        return prenom;
    }
    public String getNom()
    {
        return pere.nom;
    }
    public Fils(String p, Pere pe)
    {
        pere=pe;
        prenom=p;
    }


}
