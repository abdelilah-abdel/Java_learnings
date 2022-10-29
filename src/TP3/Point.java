package TP3;

public class Point {
    private int x ;
    private int y ;


    public Point(int X , int Y){
        x=X ; y=Y;
    }
    public Point(){
        this(0,0);
    }


    public void affiche(){
        System.out.println("---------------Affichage : Point -------------------");
        System.out.println("----------------------------------------------------");
        System.out.println("|      x                 |            y            |");
        System.out.println("|      "+this.x+"        |           "+this.y+"    |");
    }


}
