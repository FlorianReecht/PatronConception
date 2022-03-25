package Exercice3;

public class main {
    public static void main ( String [] args ) {
        Boisson boisson = new Espresso(1);
        System . out . println ( boisson . getDescription () + " ␣ : ␣ " + boisson.cout() +"euros" );
        Boisson boisson2 = new Sumatra(3);
        boisson2 = new Chocolat (boisson2);
        boisson2 = new Chocolat (boisson2);
        boisson2 = new Chantilly (boisson2);
        System . out . println (boisson2.getDescription() + " ␣ : ␣ " + boisson2.cout () + "euros");
    }
}
