public class ObjetDistantImpl implements ObjetDistant{


    public ObjetParam2 M1 ( ObjetParam1 arg ){
         System . out . println ("La méthode M1 vient d'être invoquée .");
         return new ObjetParam2 ();
         }

         public ObjetParam1 M2 ( ObjetParam2 arg ) {
             System.out.println("La méthode M2 vient d'être invoquée .");
             return new ObjetParam1();
         }

}
