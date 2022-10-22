public class exercice3_4 {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int[] Tab = {12,13,12,10,8,19,26};
        Ex1(Tab);


         int[] Tab2 = {3,7,1,9,2,8,9,1,2,5};
         Ex2(Tab2);


    }



        public static void Ex1(int[] Tab){
            System.out.println(moyn_arr(Tab));
            System.out.println(max_arr(Tab));
            System.out.println(min_arr(Tab));
            System.out.println(moy_etud(Tab));
        }

      static float moyn_arr (int[] T_reels){
        float Moy;
         int somme= 0 ;

          for (int t_reel : T_reels) {
              somme = somme + t_reel;
          }
        Moy= (float)somme/T_reels.length;

        return Moy;
    }


       static int max_arr (int[] T_reels){


        int max = T_reels[0] ;
        for ( int i = 1 ; i<T_reels.length ; i++)
        {
            if (T_reels[i]> max)
                max= T_reels[i];
        }
        return max;
    }

    static  int  min_arr (int[] T_reels ){

        int min = T_reels[0] ;
        for ( int i = 1 ; i<T_reels.length ; i++)
        {
            if (T_reels[i]< min)
                min= T_reels[i];
        }
        return min;
    }

    static  int moy_etud (int[] T_reels){

        int moy_elv_sup = 0 ;

        for (int t_reel : T_reels) {
            if (t_reel > moyn_arr(T_reels))
                moy_elv_sup += 1;
        }
        return moy_elv_sup  ;
    }


    public  static  void nine_counter(int[] Tab2){
        int nine= 0 ;
        for (int i : Tab2){
            if(i==9)
                nine=nine+1;
        }
        System.out.println("il ya "+nine+" element de valeur 9 dans le tableau");
    }

    public static void grandque4_petitque2(int[] Tab2){
        int grand = 0, petit = 0 ;

        for  (int i : Tab2){
            if (i>4){
                grand+=1;
            }if(i<2)
                petit+=1;
        }
        System.out.println("il ya "+(grand+petit)+" element plus que 4 ou plus");
    }

    public static void max_element(int[] Tab2){
        int max =0 ;

        for (int i=0; i<Tab2.length;i++){
            max = max + Tab2[i] ;
        }
        System.out.println("la somme des elements est "+max);
    }


    public static void moyenne_arth(int[] Tab2){

        int somme= 0;
        for(int i : Tab2){
            somme = somme+i ;
        }
        float moy = (float) somme / Tab2.length;

        System.out.println("la moyenne arithmetique des elements est "+moy);
    }

    public static void plus_grand (int[] Tab2){


        int max = Tab2[0] ;
        for ( int i = 1 ; i<Tab2.length ; i++)
        {
            if (Tab2[i]> max)
                max= Tab2[i];
        }
        System.out.println("le plus grand vaut : "+max);
    }

    public  static  void Ex2(int[] Tab2){
        nine_counter(Tab2);
        grandque4_petitque2(Tab2) ;
        max_element(Tab2); moyenne_arth(Tab2);
        plus_grand(Tab2);
    }




}

