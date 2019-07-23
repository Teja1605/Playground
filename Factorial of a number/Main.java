import java.util.Scanner;
class Main{
	public static void main (String[] args){
  Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int sum=1;
      while(n>0)
      {
        sum=sum*n;
        n--;
      }
      System.out.println(sum);
        
	}
}