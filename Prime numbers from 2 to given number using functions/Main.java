import java.util.Scanner;
class Main{
  public void prime(int n)
  {
   System.out.println("2"+"\n"+"3"+"\n"+"5"+"\n"+"7"); 
  for(int i=2;i<=n;i++)
  {
    int flag=0;
  for(int j=2;j<n/2;j++)
  {
  if(i%j==0)
  {
  flag=1;
  }
  }
     if(flag==0)
    {
    System.out.println(i);
    }
  }
    
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n= sc.nextInt();
      Main m = new Main();
      m.prime(n);
	}
}