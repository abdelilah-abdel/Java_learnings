package partie2;

import tp4.Personne;

import java.util.Arrays;

public class Etudiants extends Personne {


    private int nombreCours;
    private String []cours;
    private double [] notes;
    private int MAX_COURS=10;

    public Etudiants(String nom, int age) {
        super(nom, age);
        nombreCours =0 ;
        cours = new String[MAX_COURS];
        notes = new double[MAX_COURS];
        MAX_COURS = 0;
    }
    void ajouteCoursNote(String cour, double note){
        if(nombreCours<MAX_COURS){
            for (int i = 0 ; i<MAX_COURS; i++){
                cours [nombreCours] = cour;
                notes [nombreCours] = note;
                nombreCours ++;
            }
        }
    }

    void afficheNote(){
        for( int i =0 ; i<MAX_COURS ; i++){
            if(nombreCours<MAX_COURS){
                System.out.print(cours[i] +" "+ notes[i] +' '+this.nom);
            }
        }
    }

    double noteMoyenne(){
        double somme = 0 ;
        for (double note : notes){
            somme += note;
        }
        return  somme/notes.length;
    }

    @Override
    public String toString() {
        return "Etudiants{" +  this.nom +' '+ this.age ;
    }
}
