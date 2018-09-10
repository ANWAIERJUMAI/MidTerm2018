package math.problems;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
         */

int m=40, k1=0, k2=1;
        System.out.print("First" + m + "terms:");
for(int i=1; i<=m; ++i)
        {
            System.out.print(k1 + "  + ");
            int sum =k1 + k2;
            k1=k2;
            k2=sum;


        }
    }
}
