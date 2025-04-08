import java.util.Scanner;
class Inti
{
  public static void main(String args[])
  {
     
    Scanner sc =new Scanner(System.in);
    System.out.println("enter no N:");
    int n=sc.nextInt();
    int r=sc.nextInt();
    if((n<0||n>1000)||(r<0&&r>50))
    {
      System.out.println("enter 1000<=n<0 and 50<=r<0");
    }
    else
    {
    if(r==0)
    {
      System.out.println(" possible ways to fill the cistern : 0 ");
    }
    else
    {
       System.out.println("possible ways to fill the cistern : "+num( n, r));
    }
    }
 }
 static int num(int n,int r)
 {  int sum=0,rev=0,num=0,rev1=0;
    for(int i=0;i<r;i++)
    {
       while(n!=0)
       {
          rev=n%10;
          sum=rev+sum;
          n=n/10;
       }
    }
    while(sum!=0)
    {
       rev1=sum%10;
       num=num+rev1;
       sum=sum/10;
    }
    return num;
 }
}

       
