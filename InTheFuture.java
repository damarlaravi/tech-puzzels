import java.util.*;
public class InTheFuture{
	public static void main(String args[]) {
		System.out.printf("%d", minNum(3, 5, 1));
    }
	
	static int minNum(int A, int K, int P) {
        int count = 0;
        int n = 1;
        if(A == K || A > K){
            return -1;
        } else if (P == 0 && A > K){  
            return -1;
        } else {
            for(int i = 0; i < n; i++){
                if((K * i) > (A * i + P)){
                    return i;
                }
                n++;
            }
        }
	    return count;
	}
}