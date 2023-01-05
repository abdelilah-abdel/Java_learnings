package partie2;

import tp4.Personne;

public class Enseignant extends Personne {

    private  int nombreCours ;
    private  String[] cours ;
    private  final int MAX_COURS =8 ;

    public  Enseignant(String nom ,int age ){
        super(nom, age);
        nombreCours=0 ;
        cours = new String[MAX_COURS];
    }

    boolean ajouteCours(String cour){
        boolean exist ;
        if(nombreCours<MAX_COURS){
          // for (string S:  )
        }

}
