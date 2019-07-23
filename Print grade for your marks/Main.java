import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      if(n>=85)
      {
        System.out.println("A");
      }
       if(n>=75&&n<85)
      {
        System.out.println("B");
      }
        if(n>=65&&n<75)
      {
        System.out.println("C");
      }
        if(n>=55&&n<65)
      {
        System.out.println("D");
      }
        if(n>=45&&n<55)
      {
        System.out.println("E");
      }
        if(n<45)
      {
        System.out.println("Fail");
      }
                  
    }
}