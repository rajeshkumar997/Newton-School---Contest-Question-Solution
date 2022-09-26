import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static int maxProfit(int price[], int n)
    {
      
        int profit[] = new int[n];
        for (int i = 0; i < n; i++)
            profit[i] = 0;
 
      
        int max_price = price[n - 1];
        for (int i = n - 2; i >= 0; i--) {
           
            if (price[i] > max_price)
                max_price = price[i];
 
          
            profit[i] = Math.max(profit[i + 1],
                                 max_price - price[i]);
        }
 
        int min_price = price[0];
        for (int i = 1; i < n; i++) {
          
            if (price[i] < min_price)
                min_price = price[i];
 
         
            profit[i] = Math.max(
                profit[i - 1],
                profit[i] + (price[i] - min_price));
        }
        int result = profit[n - 1];
        return result;
    }

    public static void main (String[] args) {
                      // Your code here

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(maxProfit(arr, n));
    }
}
