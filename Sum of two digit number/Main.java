import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int sum=0,rem=0,i;
      for(i=0;i<3;i++)
      {
       
        {
        rem=n%10;
        sum=sum+rem;
      }
        n=n/10;
      }
      System.out.println(sum);
	}
}