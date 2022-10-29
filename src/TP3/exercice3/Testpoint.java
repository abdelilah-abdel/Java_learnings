package TP3.exercice3;

public class Testpoint {

    public static   void  main(String[] args) {

        System.out.println("-------------Point test -------------------");
        Point p1 = new Point(3, 4);
        Point p2 = new Point(5, 6);

        p1.max_distance(p1,p2);

        MaxNorme.max_distance(p1,p2);
    }

}
