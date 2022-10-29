package TP3;


public class test {

    public static   void  main(String[] args) {
        CompteBancaire compte1=  new CompteBancaire(321321435,"abdelilah",14000);
        CompteBancaire compte2 = new CompteBancaire(3282995,"asmae",3000);

            compte2.retirer_solde(6000);
            compte1.retirer_solde(5000);

            compte1.affiche();
            compte2.affiche();

        compte2.deposer(1000);
        compte1.deposer(1000);
    }
}
