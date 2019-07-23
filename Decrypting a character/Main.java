import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        Scanner in=new Scanner(System.in);
      char ch=in.next().charAt(0);
      int key = in.nextInt();
      if(ch>='a'&&ch<='z')
      {
        int sum=ch-'a'+20;
        sum=(sum+key)%26;
        ch=(char)(sum+'a');        
    }
       if(ch>='A'&&ch<='Z')
      {
        int sum=ch-'A'-4;
        sum=(sum+key)%26;
        ch=(char)(sum+'A');        
    }
      System.out.println(ch);
}
}