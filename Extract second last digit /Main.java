import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int i,j;
      i=n/10;
      j=i%10;
      System.out.println(j);
	}
}