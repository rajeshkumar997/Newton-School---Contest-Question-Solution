import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
   // public static List<Integer> spiralRotation(int arr[][]){
       // List<Integer> list = new ArrayList<Integer>();
       static void spiralRotation(int arr[][]){
        int row =arr.length;
        // if(row == 0){
        //     return list;
        // }
        int col = arr[0].length;
        int l=0, r=col-1, t=0, b=row-1, d=0;

        while(l<=r && t<=b){
            if(d==0){
                for(int i=l; i<=r; i++){
                    //list.add(arr[t][i]);
                    System.out.print(arr[t][i]+ " ");
                }
                d=1; t++;
            }
            else if(d==1){
                for(int i=t; i<=b;i++){
                    //list.add(arr[i][r]);
                    System.out.print(arr[i][r]+ " ");
                }
                d=2; r--;
            }
            else if(d==2){
                for(int i=r; i>=l;i--){
                    //list.add(arr[b][i]);
                    System.out.print(arr[b][i] + " ");
                }
                d=3;b--;
            }
            else if(d==3){
                for(int i=b;i>=t; i--){
                    //list.add(arr[i][l]);
                    System.out.print(arr[i][l]+ " ");
                }
                d=0; l++;
            }
        }
        //return list;
    }
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        //System.out.println(spiralRotation(arr));
        spiralRotation(arr);
    }
}
