import java.util.Scanner;
class Main
{
  public static int square_of_number(int n)
  {
    int res=0;
   res=n*n;
 return res;
  }
	public static void main (String[] args)
    {
	 Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      Main m=new Main();
      int result=m.square_of_number(n);
      System.out.println(result);
    }       
}
