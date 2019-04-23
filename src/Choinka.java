public class Choinka {
    int rozmiar;

    public Choinka(int rozmiar)
    {
        this.rozmiar=rozmiar;
    }

   /* public void rysuj()
    {
        int spacji = rozmiar-1;
        for(int i = 0 ; i<rozmiar; i++)
        {
        }
        for(int j=0; j < rozmiar; j++)
        {
            if(j < spacji)
            {

         }
        }
    }*/

   public void rysuj()
   {
       int ilegwiazdek=1;
       int ilespacji=rozmiar/2;
       int pom;
       for (int i=0; i<rozmiar; i++)
       {
           for (int s=1;s<=ilespacji;s++)
           {
               System.out.print(" ");
           }
           for (int g=1;g<=ilegwiazdek;g++)
           {
               System.out.print("*");
           }
           ilegwiazdek=ilegwiazdek+2;
           ilespacji=ilespacji-1;
           System.out.println();
           i++;
       }




   }

}
