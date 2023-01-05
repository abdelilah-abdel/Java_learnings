package tp4;

import java.util.Arrays;

public class Personne {

    protected   String nom ;
    protected int age ;
    protected double[] comptes ;


    public Personne(String nom, int age ){
        this.nom=nom ;
        this.age=age;
    }
//    public Personne(){}

    public  Personne(String nom , int age , double[] comptes){
        this(nom,age);
        this.comptes = comptes;
    }

    void afficher(){
        System.out.println("Nom :"+nom+" Age : "+age+"compte :");
        for(double cmpt : comptes ){
            System.out.println(+cmpt);
        }
    }


    int getAge(){
        return age;
    }

    public  String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void  diviserParDeux(){
        double c ;
        for(double cmpt : comptes ){
            c = cmpt/2 ;
            cmpt =c;
        }

    }

    @Override
    public String toString() {
        return "Personne{" +  "nom='" + nom + '\'' + ", age=" + age  +"}" ;
    }
}
