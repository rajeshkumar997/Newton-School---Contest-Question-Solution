import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static boolean isVowel(char ch){
        if(ch=='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String str = sc.next();

        int ans =0;
        int j=0;
        int count=0;

        for(int i=0; i<n; i++){
            if(isVowel(str.charAt(i))){
                ans = Math.max(ans, i-j+1);
                continue;
            }
            else{
                count++;
                if(count>k){
                    while(j<=i && isVowel(str.charAt(j))){
                        j++;
                    }
                    j++;
                    count--;
                }
                ans = Math.max(ans, i-j+1);
            }
        }
        System.out.println(ans);
    }
}
