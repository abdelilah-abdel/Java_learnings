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


    public static Point maxNorme2(Point p1, Point p2) {
        int origine_p1 = (int) Math.sqrt(Math.pow(p1.x, 2) + Math.pow(p1.y, 2));
        int origine_p2 = (int) Math.sqrt(Math.pow(p2.y, 2) + Math.pow(p2.x, 2));


        if (origine_p1 > origine_p2) {
            System.out.println("distance max " + origine_p1);
            return p1;
        } else {
            System.out.println("distance max " + origine_p2);
            return p2;
        }

    }
         public Point maxNorme(Point p2){
            int current_point = (int) Math.sqrt(Math.pow(this.x,2)+ Math.pow(this.y,2));
            int origine_p2 = (int) Math.sqrt(Math.pow(p2.y,2)+ Math.pow(p2.x,2));

            if(current_point > origine_p2){
                System.out.println("distance max "+current_point);
                return  this ;
            }
            else {
                System.out.println("distance max "+origine_p2);
                return p2;
            }
        }

}

