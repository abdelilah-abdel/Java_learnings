import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

      //  System.out.println("Enterer les demension de la matrice ");

      //  int i =sc.nextInt();
      //  int j = sc.nextInt();

        //int[][] Tab = new  int[i][j];
        int[][] Tab2 = {{1, 2, 3,4}, {4, 5, 6,8}};
        int[][] Tab = {{1, 2, 3,4}, {4, 5, 6,8}};

       // System.out.println("un tableau de "+i+"et "+ j +"est cree");

       // Test_Table(Tab)  ;
           Test_two_tables_len(Tab2,Tab);


    }



    public static boolean Test_Table(int[][] Tab) {

        if (Tab.length == Tab[0].length) {
            System.out.println("est une matrice carre");
            return true;
        } else
        {            System.out.println(" matrice qui nest pas carre");
        return false;
    }

    }

    public  static  boolean Test_two_tables_len(int[][] Tab1, int[][] Tab2){

        if ( Tab1.length == Tab2.length && Tab1[0].length == Tab1[0].length) {
            return true;
        }
        else
        {
            return  false;
        }
    }

    public  static  void Afficher_Table(int[][] Tab ){

        for ( int[] row:Tab){
            for(int j: row ){
                System.out.print("element"+" ");
            }
            System.out.println();

        }
    }

    public static  int[][] Transpose_matrice(int[][] Tab){
        int[][] matrice_t = new int[Tab.length][Tab[0].length];

        for(int i= 0 ; i<Tab.length ; i++ )
        {
            for (int j =0 ; i<Tab[0].length ; i++)
            matrice_t[i][j]= Tab[j][i];
        }
        return matrice_t;
    }


    public static boolean   multiplication_compatibility(int[][] matrice1, int[][] matrice2){

        if(matrice1.length== matrice2[0].length){
            return   true ;
        }
        else return false ;
    }


        public static  int[][] multiplication_two_matrice(int[][] matrice1, int[][] matrice2){

            int[][] matrice_m = new int[matrice1.length][matrice2[0].length];

        return  matrice1;

    }

}