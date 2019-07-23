import java.util.Scanner;
class Main {
	public static void main (String[] args){
	Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int count = 0;
      int  i = 1;
     
      while(count < n){
      if(i%2==1){
     	System.out.println(i);
        count++;
        
      }i++;
      }
	}
}