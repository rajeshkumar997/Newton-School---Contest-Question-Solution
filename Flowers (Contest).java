import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long sum=0;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<n;i++)
		{
		    int x=sc.nextInt();
		    if(x%2==0){
		        sum+=x-1;
				x-=1;
				}
		    else{
		        sum+=x;
			}
			if(x<min)
			min=x;
		}
		if(sum%2==0)
		    sum=sum-min;
		System.out.println(sum);

				//second method
		
		//  Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int arr[] = new int[n];
        // for (int i=0; i<n; i++) {
        //     arr[i] = sc.nextInt();
        // }
        // long sum = 0;
        // int min = Integer.MAX_VALUE;
        // for (int i=0; i<n; i++) {
        //     if (arr[i] % 2 == 1) {
        //         sum += arr[i];
        //     }
        //     else {
        //         sum += arr[i]-1;
        //     }
        //     if (arr[i] < min) {
        //         min = arr[i];
        //     }
        // }  
        // if (n % 2 == 1) {
        //     System.out.print(sum);
        // }
        // else {
        //     if (min % 2 == 1) {
        //         System.out.print(sum - min);
        //     }
        //     else {
        //         System.out.print(sum - min + 1);
        //     }
        // }

    }
}
