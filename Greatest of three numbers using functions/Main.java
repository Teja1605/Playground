import java.util.Scanner;
class Main{
  public void great(int n1,int n2,int n3)
  {
    int res=0;
  if(n1>n2)
  {
  res=n1;
  }
    else
    {
    res=n2;
    }
    if(res>n3)
    {
      System.out.print(res);
    }
    else
    {
    System.out.print(n3);
    }
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int n1=sc.nextInt();
      int n2=sc.nextInt();
      int n3=sc.nextInt();
      Main m= new Main();
      m.great(n1,n2,n3);
	}
}