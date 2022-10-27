package Ville;

public class Equation {

    public static   void  main(String[] args){

        Equation e1 = new Equation(2,-3,9f/8f);  // impooooortant
        e1.resoudre_eqt();
        System.out.println(e1.delta_calculation());

        e1.affiche();
    }


    private float  a , b , c ;
    private  float delta;
    private  float x1 , x2;

    public  Equation(float i, float i1, float i2){
        a= i ; b= i1; c= i2 ;
    }

    public Equation(){
        this(0,0,0) ;
    }


    public  float delta_calculation(){

    return   (float) Math.pow(b,2)-4*a*c;
    }

    public  float resoudre_eqt(){
        if (this.delta_calculation() < 0  ){
            return -1;
        }
        else  if (this.delta_calculation() == 0){
            x1 =   (-b)/(2*a);
            return  0;
        }
        else {
             x1 = (float) ((-b - (Math.sqrt(delta)) )/ (2*a));
            x2 = (float) ((-b + (Math.sqrt(delta)) ) / (2*a));
            return  1 ;
        }
    }

    public  void  affiche(){

        if (this.delta_calculation() < 0  ){
            System.out.println(" y'a pas de solution dans R ");
        }
        else  if (this.delta_calculation() == 0){
            System.out.println("i lya un seul racine  x = "+this.x1);
        }

        else if (this.delta_calculation() > 0){
            System.out.println("i lya un seul racine  x1 = "+this.x1 +" x2 = "+this.x2);
        }
    }




}
