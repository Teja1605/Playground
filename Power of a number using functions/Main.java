import java.util.*;
import java.lang.Math;
public class Main{
  public int power(int e,int b)
  {
  double p=0;
    double e1=Double.valueOf(e);
    double b1=Double.valueOf(b);
    p=Math.pow(b1,e1);
    return (int)p;
  }
  
public static void main(String[] args)
{
Scanner sc= new Scanner(System.in);
  int b=0,e=0;
  b=sc.nextInt();
  e=sc.nextInt();
  Main m= new Main();
  int res= m.power(e,b);
  System.out.println(res);
}
}