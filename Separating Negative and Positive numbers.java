import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
     static void segregateElements(int arr[], int n){
        int temp[] = new int[n];
        int k=0;
        for(int i=0;i<n; i++){
            if(arr[i]<0){
                temp[k] = arr[i];
                k++;
            }
        }
        if(k==n || k==0){
            return;
        }
        for(int i=0; i<n; i++){
            if(arr[i]>=0){
                temp[k] = arr[i];
                k++;
            }
        }
        for(int i=0; i<n; i++){
            arr[i] = temp[i];
        }
    }
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        segregateElements(arr, n);

        for(int i=0; i<n; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
