import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if(count == 0){
                count++;
            }
            else if(count == 1 && s.charAt(i) == ')'){
                count--;
            }
            else{
                sb.append(s.charAt(i));
                if(s.charAt(i) == '(')
                count++;
                else count--;
            }
        }
        System.out.print(sb.toString());
    }
}
