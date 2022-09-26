import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {

        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();
            int i=0;
            int j=s.length()-1;
            int ans=0;
            while(i<j){
                char a=s.charAt(i);
                char b=s.charAt(j);
                if(a!=b){
                    ans+=Math.abs(b-a);
                }
                i++;
                j--;
            }
            System.out.println(ans);
        }
    }
}
