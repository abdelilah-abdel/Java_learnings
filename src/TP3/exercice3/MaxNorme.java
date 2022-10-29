package TP3.exercice3;

public class MaxNorme {



    public  static int max_distance(Point p1, Point p2){
        int origine_p1 = (int) Math.sqrt(Math.pow(p1.getX(),2)+ Math.pow(p1.getY(),2));
        int origine_p2 = (int) Math.sqrt(Math.pow(p2.getX(),2)+ Math.pow(p2.getY(),2));
        System.out.println("Affichage : methode static ");


        if(origine_p1 > origine_p2){
            System.out.println("distance max "+origine_p1);

            return  origine_p1;
        }
        else {
            System.out.println("distance max "+origine_p2);
            return origine_p2;
        }
    }



}
