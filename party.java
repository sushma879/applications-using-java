import java.util.Scanner;
class Party
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter party organized time");
      int n=sc.nextInt();
      int E[]=new int[n+1];
      int L[]=new int[n+1];
      for(int i=1;i<=n;i++)
      {
              System.out.println("enter no of guests entered at "+i+" hr");
              E[i]=sc.nextInt();
              System.out.println("enter no of guests leaved at "+i+" hr");
              L[i]=sc.nextInt();
      }
      System.out.println("maximum no of guests present is "+maxG(n,E,L));
   }
   static int maxG(int n,int E[],int L[])
   {
       int v=0;
       int max=E[0]-L[0];
       
       for(int i=0;i<5;i++)
       {
          v=v+E[i]-L[i];
          if(v>max)
          {
            max=v;
          }
      }
      return max;
  }
}
