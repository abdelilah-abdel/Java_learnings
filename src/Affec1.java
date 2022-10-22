public class Affec1 {

        public static void main(String args[]){
            int t1[] = {1,2,3};
            int t2[] = new int[4];
            int t3[] = new int[3];

            for (int i=0 ; i<4 ; i++)
                t2[i]= 2*i;
            t2=t1;
            t3=t1;

            for (int i=0; i<t1.length ; i++)
                System.out.println(t3[i]);
            //System.out.println(t1[1]);

        }

            public static int[] Copyarray( int[] T1 , int[] T2){
                T1=T2;
                for (int i=0; i<T2.length ; i++)
                    System.out.println(T2[i]);
                return  T2;
            }


        // 1- que se passera t-il si l'on execute le programme suivant :
        // erreur = Index 3 out of bounds for length 3
        // parceque on a affecter les valeurs de t1 a t2 , et donc t2 a seulement 3(0-2) index et non pas 4.



}
