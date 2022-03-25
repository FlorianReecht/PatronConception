package Exercice3;

public class Chocolat extends Ingredient{

    public Chocolat(Boisson base) {
        super((0.25* base.taille)+base.cout+ base.cout(), base.description+" supplément chocolat ", base);
    }
}
