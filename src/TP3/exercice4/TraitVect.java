package TP3.exercice4;

import javax.sql.rowset.spi.SyncResolver;
import java.util.Vector;

public class TraitVect {

    private  double x, y , z ;


    public TraitVect(double vv1, double vv2 , double vv3){
        x=vv1;
        y=vv2;
        z=vv3;
    }
    public TraitVect(){
        this(0,0,0);
    }



    public void affiche(){
        System.out.println("--*---Vecteur :");
        System.out.println("x : "+ x);
        System.out.println("y : "+ y);
        System.out.println("z : "+ z);
    }

    public  double normeVect(){
        double norme = (float)  (Math.pow(x,2)+Math.pow(y,2)+Math.pow(z,2));
        return norme;
    }

    public static  TraitVect  someVect(TraitVect v1,TraitVect v2){
        TraitVect v3 = new TraitVect(v1.x+v2.x,v1.y+v2.y,v1.z+v2.z);
        System.out.println("somme vect  : ");
        v3.affiche();

        return  v3;
    }


    public double produitVect(TraitVect v2){
        double ps=  ((this.x*v2.x)+(this.y*v2.x)+(this.z* v2.z));
        System.out.println("produit vect : "+ps);
        return ps;
    }
}
