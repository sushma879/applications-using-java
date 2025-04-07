import java.util.Scanner;
class Paint
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter no of interior walls");
      int n1=sc.nextInt();
      System.out.println("enter no of exterior walls");
      int n2=sc.nextInt();
      System.out.println("enter surface area of interior walls");

      double Is[]=new double[n1];

      double Es[]=new double[n2];
      for(int i=0;i<n1;i++)
      {
              Is[i]=sc.nextDouble();
      }
      System.out.println("enter surface area of exterior walls");

       for(int i=0;i<n2;i++)
      {
              Es[i]=sc.nextDouble();
      }

      System.out.println("cost is "+cost(n1,n2,Es,Is));
   }
   static double cost(int n1,int n2,double Es[],double Is[])
   {
      double c=0,c1=0,c2=0;
      double Ec=12.0,Ic=18.0;
      for(double i:Es)
      {
         c1=c1+(Ec*i);
      }
      for(double j:Is)
      {
         c2=c2+(Ic*j);
      }
      return c1+c2;
  }
}
