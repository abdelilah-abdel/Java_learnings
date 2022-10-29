package TP3.exercice2;

public class CompteBancaire {
         private int num_compte;
         private  String nom_prop ;
         private float solde_compte;

public CompteBancaire(int num , String nom , float solde) {
    num_compte = num ;
    nom_prop= nom ;
    solde_compte = solde ;
}

public CompteBancaire(){
this(0,null,0);
}


public  void  affiche(){
        System.out.println("nom de propietaire : "+ nom_prop);
         System.out.println("num de compte  : "+ num_compte);
         consultersolde();
}


public  void consultersolde(){
    System.out.println("votre solde est : "+this.solde_compte);
}

public  int deposer(int plus_money){
    System.out.println("--------------- Opreration : Deposer -------------------");
    System.out.println("votre solde  : "+ this.solde_compte);
    this.solde_compte = solde_compte+plus_money;
    System.out.println("le nouveau solde  : "+ this.solde_compte);
    return  1;
}

    public int retirer_solde(int moins_money) {

    if(solde_compte > moins_money){
        this.solde_compte = solde_compte-moins_money;
        System.out.println("--------------- Opreration : Retrait-------------------");
        System.out.println("le nouveau solde  : "+ this.solde_compte);

        return 1;
    } else{
        System.out.println("Erreur , votre solde est insuffisant pour cette operation "+ this.solde_compte);
        return  0 ;
    }

    }




}
