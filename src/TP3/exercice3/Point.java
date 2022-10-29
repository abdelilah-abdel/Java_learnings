package TP3.exercice3;

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

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public float max_distance(Point p1, Point p2) {
        int origine_p1 = (int) Math.sqrt(Math.pow(p1.getX(),2)+ Math.pow(p1.getY(),2));
        int origine_p2 = (int) Math.sqrt(Math.pow(p2.getX(),2)+ Math.pow(p2.getY(),2));


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

