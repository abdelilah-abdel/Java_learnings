public class Matrices {

    public static void main(String args[]){

        double[][] t1 = { {8, 5, 2},  {8, 8, 8}};
        int[][] t2 = { {6, 3, 7},  {2, 1, 10} };

        affiche(t1);

    }




    public static   void affiche(double t[][])
    {
        int lignes = t.length;
        int columns = t[0].length;

        for(int i = 0; i < lignes; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(t[i][j] + " ");
            }
            System.out.println();
        }
    }



}
