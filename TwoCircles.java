import java.util.*;

public class TwoCircles {
	public static void main(String[] args) {
		 int x1 = -10, y1 = 8;
		int x2 = 14, y2 = -24;
		int r1 = 30, r2 = 10;
		String[] cir = {"12 0 21 14 0 23", "0 15 11 0 20 16"};
		String[] stringArr = circles(cir);
		String outputString = "";
		for (String s: stringArr) {           
            System.out.println(s); 
        }
	}
 
	static String[] circles(String[] info) {
		String[] output = new String[info.length];
        for (int i = 0; i < info.length; i++) {
            // sample[] will have X1, Y1, R1, X2, Y2 & R2 at respective indexes
            int[] sample = Arrays.stream(info[i].split(" ")).mapToInt(Integer::parseInt).toArray();
            double d = Math.sqrt(Math.pow(sample[0] - sample[3], 2) + Math.pow(sample[1] - sample[4], 2));
            if (sample[0] == sample[3] && sample[1] == sample[4]) {
                output[i] = "Concentric";
            } else if (d == Math.abs(sample[2] - sample[5]) || d == Math.abs(sample[2] + sample[5])) {
                output[i] = "Touching";
            } else if (d > Math.abs(sample[2] - sample[5]) && d < Math.abs(sample[2] + sample[5])) {
                output[i] = "Intersecting";
            } else if (d < Math.max(sample[2], sample[5])) {
                output[i] = "Disjoint-Inside";
            } else if (d > Math.abs(sample[2] + sample[5])) {
                output[i] = "Disjoint-Outside";
            }
        }
        return output;
	}
}