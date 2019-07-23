import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int i,j,k,m;
      m=n%10;
      i=m%10;
      j=n/100;
      k=i+j;
      System.out.println(k);
      
      
	}
}