import java.util.*;

public class LargestSubsetSum {

 static long[] maxSubsetSum(int[] k) {
  long out[] = new long[k.length];
  for (int j = 0; j < k.length; j++) {

   int sum = 0;
   double LIM = Math.sqrt(k[j]);
   for (int i = 1; i <= LIM; i++) {
    if (k[j] % i == 0) {
     if (i == (k[j] / i))
      sum += i;
     else
      sum += (i + k[j] / i);
    }
   }
   out[j] = sum;
  }
  return out;
 }
 public static void main(String[] args) {
  int N = 4;
 int myArray[] = {2,4,8};
 System.out.println(Arrays.toString(maxSubsetSum(myArray)));

 }
}