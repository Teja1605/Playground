import java.util.Scanner;
public class Main{
  public void gcd(int n1,int n2,int n3)
  {
  int res=1;
    for(int i=1;i<=n1 && i<=n2;i++)
    {
    if(n1%i==0 && n2%i==0)
    {
    res=i;
    }
    }
    int res1=0;
    for(int i=1;i<=res && i<=n3;i++)
    {
    if(res%i==0 && n3%i==0)
    {
    res1=i;
    }
    }
    System.out.print(res1);
  }
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int n1=sc.nextInt();
      int n2=sc.nextInt();
      int n3=sc.nextInt();
      Main m=new Main();
      m.gcd(n1,n2,n3);
	}
}