import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
        static void countDistinct(int arr[], int K){
        HashMap<Integer, Integer> hM
            = new HashMap<Integer, Integer>();
        for (int i = 0; i < K; i++)
            hM.put(arr[i], hM.getOrDefault(arr[i], 0) + 1);
 
        System.out.print(hM.size() + " ");
        for (int i = K; i < arr.length; i++) {
            if (hM.get(arr[i - K]) == 1) {
                hM.remove(arr[i - K]);
            }
            else 
                hM.put(arr[i - K], hM.get(arr[i - K]) - 1);
            hM.put(arr[i], hM.getOrDefault(arr[i], 0) + 1);
            System.out.print(hM.size() + " ");
        }
    }
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int k = sc.nextInt();
        int arr[] =  new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        countDistinct(arr,k);
    }
}
