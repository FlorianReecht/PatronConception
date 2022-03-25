package Exercice2;

public class main {
    public static void main(String[] args) {
        System.out.println("hello world");

        Colvert c= new Colvert();
        Mandarin m = new Mandarin();
        //Question 1
        System.out.println(c.afficher());
        System.out.println(m.afficher());

        //Question 2
        //L'héritage d'une seule super classe :
        /**
         * les modifications peuvent affecter involontairement d'autres canards
         * Le code est dupliqué entre les sous classes si plusieurs sous classes ont le même comportement
         *
         */
        System.out.println("--------------------");

        Colvert c2= new Colvert();
        System.out.println(c2.afficher());
        System.out.println(c2.effectuerVol());
        System.out.println(c2.effectuerCancan());
        System.out.println("________");
        Leurre l = new Leurre();
        System.out.println(l.afficher());
        System.out.println(l.effectuerVol());
        System.out.println(l.effectuerCancan());
        System.out.println("________");
        Prototype p = new Prototype();
        System.out.println(p.afficher());
        System.out.println(p.effectuerVol());
        System.out.println(p.effectuerCancan());
        System.out.println("________");



    }
}
