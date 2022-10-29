package TP3.exercice4;

public class test {

    public static   void  main(String[] args) {
        TraitVect v1 = new TraitVect(1,2,3) ;
        TraitVect v2 = new TraitVect(3,4,5);
        v1.affiche();
        v1.normeVect();
        TraitVect.someVect(v1,v2);
        v1.produitVect(v1);

    }
}
