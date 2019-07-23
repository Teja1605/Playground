import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
	 Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        print_ele(a, n);
    }
        public static void print_ele ( int a[],int n)
        {
            int sum = 0, count = 0;
            int l = a.length;
            if(l%2==0) {
                for (int i = 0; i < l / 2; i++) {
                    sum = sum + a[i];
                }

                for (int i = l / 2; i < l; i++) {
                    count = count + a[i];
                }
            }
            if(l%2!=0) {
                for (int i = 0; i < l / 2; i++) {
                    sum = sum + a[i];
                }

                for (int i = l / 2+1; i < l; i++) {
                    count = count + a[i];
                }
            }
            if (sum == count) {
                System.out.println("Perfect Batch");
            } else {
                System.out.println("Not a Perfect Batch");
            }


  }
}