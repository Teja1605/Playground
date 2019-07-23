import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner sc= new Scanner(System.in);
      int N= sc.nextInt();
      for(int i=1;i<=N;i++)
      {
      for(int j=1;j<=N;j++)
      {
      if(i%2!=0 && j!=N)
      {
        System.out.print(i);
      }
        if(i%2!=0 && j==N)
        {
        System.out.print(i+1);
        }
        if(i%2==0 && j!=1)
        {
          System.out.print(i);
        }
        if(i%2==0 && j==1)
        {
          System.out.print(i+1);
        }
        
      }
        System.out.print("\n");
      }
	}
}