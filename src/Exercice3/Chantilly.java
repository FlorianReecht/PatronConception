package Exercice3;

public class Chantilly extends Ingredient{
    public Chantilly(Boisson base) {
        super(0.50* base.taille+ base.cout(), base.description + " supplement Chantilly ", base);
    }
}
