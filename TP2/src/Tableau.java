
import java.util.Scanner;
import java.lang.Math;


public class Tableau {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        create_Table();
    }


    public static int create_Table() {
        Scanner sc = new Scanner(System.in);//System.in: Entrée Standard

        System.out.print("Combien de valeurs :");
        int a = sc.nextInt();

        int[] T_carre = new int[a];



        for (int i = 1; i <= a; i++) {

            int C = (int) Math.pow(i,2);
             T_carre[i]= T_carre[C];
        }
        for (int i = 1; i <= a; i++){
            System.out.println(i + " a pour carre " + T_carre[i]);
        }

    return  0;
    }
}