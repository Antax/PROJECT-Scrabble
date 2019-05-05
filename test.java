public class test{
   public static void main(String[] args) {
        /*SacDeLettres sac = new SacDeLettres();
        String strSac=sac.SacToString();
        System.out.println(strSac);
        Chevalet c =new Chevalet ();
        c.remplirChevalet(sac);
        String strC=c.chevaletToString();
        System.out.println(strC);
        System.out.println(strSac);*/

        /*CaseDePlateau caseCl = new CaseDePlateau("m2");
        String strCase = caseCl.caseToString();
        System.out.println(strCase);
        caseCl.lettre=new Lettre('A');
        strCase = caseCl.caseToString();
        System.out.println(strCase);*/
        Lettre A = new Lettre ('A');
        Plateau plateau = new Plateau();
        String strPlateau = plateau.plateauToString();
        System.out.println(strPlateau);
        plateau.placerLettre(A, 14, 14);
        System.out.println(strPlateau);
   } 
}