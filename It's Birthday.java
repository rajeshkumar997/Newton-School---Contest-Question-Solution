import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        int k = sc.nextInt();

        Deque<Character> Q = new LinkedList<Character>();
        int sz = n-k;

        for(int i=0; i<n; i++){
            while(!Q.isEmpty() && Q.peekLast()<str.charAt(i) && k>0){
                Q.pollLast();
                k--;
            }
            Q.addLast(str.charAt(i));
        }
        for(int i=0; i<sz; i++){
            System.out.print(Q.peekFirst());
            Q.pollFirst();
        }
    }
}
