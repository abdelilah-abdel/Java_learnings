public class UtilTab {

    public static void main(String[] args){


        genere(20);


        int[][] t1 = { {8, 5, 2},  {8, 8, 8}};
        int[][] t2 = { {6, 3, 7},  {2, 1, 10} };

        sum_vectors(t1,t2);

    }

    static  int[] genere( int n ){
        int[] n_impairs = new int[n/2];
        int j =0 ;
        for(int i = 1; i<n; i=i+2){
                if(i%2==0)
                    i=i+1;
                else
                    n_impairs[j]=i;
                    j=j+1;
        }

        for (int i : n_impairs)
            System.out.print(i+" ");
    return n_impairs;

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


   static  void sum_vectors(int[][] T1 , int[][] T2){
        int lignes = T1.length;
        int columns = T1[0].length;

        int[][] vect = new int[lignes][columns];

        if(Test_two_tables_len(T1,T2)==true){

            for(int i = 0; i < lignes; i++) {
                for (int j = 0; j < columns; j++) {
                    vect[i][j] = T1[i][j] + T2[i][j];
                }
            }

            for(int i = 0; i < lignes; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.print(vect[i][j] + " ");
                }
                System.out.println();
            }

        }
        else
            System.out.println("both tables should have same size");

   }


    public  static  void Afficher_Table(int[][] Tab ){

        for ( int[] row:Tab){
            for(int j: row ){
                System.out.print("element"+" ");
            }
            System.out.println();

        }
    }

    }

