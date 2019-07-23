import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int i,j,k;
      i=n%10;
      j=n/10;
      k=i+j;
      System.out.println(k);
      
	}
}