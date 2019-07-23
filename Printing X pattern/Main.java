import java.util.Scanner;
class Main {
	public static void main (String[] args){
     Scanner sc=new Scanner(System.in);                                            
      int N=sc.nextInt();                                                                                
      for(int i=1;i<=N;i++)                                                                                    
      {                                                                                                           
      for(int j=1;j<=N;j++)                                       {
        if(i==j ||(j==N-i+1 && j!=i))
        {
          System.out.print("*");
        }
        else
        {
        System.out.print(" ");
        }
      }
        System.out.print("\n");
      }
	}
}



