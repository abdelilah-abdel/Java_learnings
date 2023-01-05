package tp4;

public class GestionPersonne {
    public static void main(String[] args){

        double[] T1 = new double[]{5,65,68,98};
        double[] T2 = new double[]{45,500,69,98,82};
        Personne P1=new  Personne ("abdelilah",18,T1);
        Personne P2=new Personne("farah",20,T2);

        P1.diviserParDeux();
        P1.afficher();

        System.out.println(P1);

        System.out.println(P1.toString());
    }
}
