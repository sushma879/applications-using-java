import java.util.Scanner;
class Carry
{
  public static void main(String args[])
  {
     
    Scanner sc =new Scanner(System.in);
    System.out.println("enter no Num1:");
    int n1=sc.nextInt();
    System.out.println("enter no Num2:");
    int n2=sc.nextInt();
    if(n1>0&&n2>0)
    {
       System.out.println("no of carries is "+fn(n1,n2));
    }
    else
    {
    System.out.println("INVALID INPUT");
    }
  }
  static int fn(int n1,int n2)
  {
     int c=0,rev1=0,rev2=0,count=0;
     while(n1>0&&n2>0)
     {
        rev1=n1%10;
        n1=n1/10;
        rev2=n2%10;
        n2=n2/10;
        if(rev1+rev2+c>9)
        {
           count=count+1;
           c=1;
        }
        else
        {
          c=0;
        }
     }
    return count;
  }
}