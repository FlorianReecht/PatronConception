package Exercice3;

public class Boisson {
    String description;
    double cout;
    int taille; //=1 pour petit 2 pour moyen 3 pour grand

    public String getDescription()
    {
        return description;
    }
    public double cout()
    {
        return cout;
    }
    public Boisson(double c,String description,int taille)
    {
        this.description=description;
        cout=c;
        this.taille=taille;
    }
}
