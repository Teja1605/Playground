import java.util.Scanner;
class Main{                                                                                                                             
  public static void cancatenate(int n, int a[]){                                                                           
     int a1[] = new int[n]; 
        int l = 0;                                                                                                                            
        int b1[] = new int[n];
        int m = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] > 0) {
                a1[l] = a[i];
                l++;
            }
            if (a[i] == 0) {
                b1[m] = a[i];
                m++;
            }
        }
        n = 0;
        for (int i = 0; i < l; i++) {
            a[n] = a1[i];
            n++;
        }
        for (int i = 0; i < m; i++) {
            a[n] = b1[i];
            n++;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=in.nextInt();
        }
        cancatenate(n, a);
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}

