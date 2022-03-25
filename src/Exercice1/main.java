package Exercice1;

import Exercice1.Fille;
import Exercice1.Fils;
import Exercice1.Pere;

public class main {
    public static void main(String[] args) {
        System.out.println("hello world");
        Fille f= new Fille("Alice");
        f.compter();
        System.out.println(f.getPrenom());
        System.out.println("-----------");

        Pere p= new Pere("Bob","Dupont");
        Pere p2= new Pere("Charlie", "Durand");
        Fils fi= new Fils("Florian",p);
        System.out.println(fi.getPrenom());
        System.out.println(fi.getNom());
        fi.setPere(p2);
        System.out.println(fi.getNom());
    }
}
