import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
      boolean ispresent=false;
      boolean ispresent1=false;
      int n=in.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
      {
        a[i]=in.nextInt();
       }
      int m=in.nextInt();
      int l=in.nextInt();
      int sum=0,sum1=0;
      for(int i=0;i<n;i++)
      {
        if(a[i]==m)
        {
          ispresent=true;
            sum= i;
        }
        if(a[i]==l)
        {
          ispresent1=true;
            sum1= i;
        }
          }
      if(ispresent==true && ispresent1==true)
      {
      System.out.println(sum);
       System.out.println(sum1);
      }
      else if(ispresent==true)
      {
        System.out.println(sum);
       System.out.println("-1");
      }
      else if(ispresent1==true)
      {
        System.out.println("-1");
       System.out.println(sum1);
      }
      
      
    }
}