import java.util.Scanner;

public class ConsecutiveSum {
	public static void main(String[] args) {
		System.out.println(" Please enter the input number :");
		Scanner in = new Scanner(System.in);
		int value = Integer.parseInt(in.nextLine());
		System.out.printf("%d", consecutive(value));
		in.close();
	}

	private static int consecutive(long N) {
		int start = 1, end = 1;
		int sum = 1;
		int count = 0;
		while (start <= N / 2) {
			if (sum < N) {
				end += 1;
				sum += end;
			} else if (sum > N) {
				sum -= start;
				start += 1;
			} else if (sum == N) {
				for (int i = start; i <= end; ++i)
					// System.out.print(i+" ");

					System.out.printf("\n");
				sum -= start;
				start += 1;
				count++;
			}
		}
		return count;
	}
}
