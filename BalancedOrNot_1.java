import java.util.*;
public class BalancedOrNot {
    public static void main(String args[]) {
        String[] sample = { "<>>>", "<>>>>" };
        int[] max = { 2, 2 };
        
        System.out.println(Arrays.toString(balancedOrNot(sample, max)));
    }
    static int[] balancedOrNot(String[] expressions, int[] maxReplacements) {
        int[] output = new int[expressions.length];
        for (int i = 0; i < expressions.length; i++) {
            Stack s = new Stack();
            int j;
            for ( j = 0; j < expressions[i].length(); j++) {
                char ch = expressions[i].charAt(j);
                  if (ch == '>') {
                    if (s.isEmpty() && maxReplacements[i] > 0) {
                        maxReplacements[i]--;
                    } else if (s.isEmpty()) {
                        break;
                    } else if ((char)s.peek() == '>' && maxReplacements[i] > 0) {
                        maxReplacements[i]--;
                    } else {
                        s.pop();
                    }
                } else if (ch == '<') {
                    s.push(ch);
                }
            }
            if (j < expressions[i].length()) {
                output[i] = 0;
            } else if  (s.isEmpty()) {
                output[i] = 1;
            } else {
                output[i] = 0;
            }
        }
        return output;
    }
}
