package Exercice3;

public class Ingredient extends Boisson{
    Boisson base;

    public Ingredient(double c, String description,Boisson base) {
        super(c, description, base.taille);
    }
}
