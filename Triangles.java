import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static int triangle(int arr[], int n)
    {
        Arrays.sort(arr);
        int count = 0;
        for (int i = n - 1; i >= 1; i--)
        {
            int l = 0, r = i - 1;
            while (l < r)
            {
                if(arr[l] + arr[r] > arr[i])
                {
                    count += r - l;
                    r--;
                }
                else
                    l++;
            }
        }
        return count;
    }
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print(triangle(arr, n));
    }
}
