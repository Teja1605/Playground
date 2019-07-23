import java.util.Scanner;
class Main {
	public static void main (String[] args){
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int sum=0;
         int rem=n%10;
         sum=sum+rem;
         while(n>10)
         {
           n=n/10;
	}sum=sum+n;
       
      System.out.println(sum);
    }
}