public class test{
   public static void main(String[] args) {
        SacDeLettres sac = new SacDeLettres();
        String strSac=sac.SacToString();
        System.out.println(strSac);
        Chevalet c =new Chevalet ();
        c.remplirChevalet(sac);
        String strC=c.chevaletToString();
        System.out.println(strC);
        System.out.println(strSac);
   } 
}