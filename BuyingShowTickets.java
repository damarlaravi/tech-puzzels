import java.util.Arrays;
import java.util.List;

public class BuyingShowTickets {

	public static void main(String[] args) {
		System.out.println(waitingTime(new int[]{4, 1, 1, 1, 1, 0}, 1));
	}

	public static long waitingTime(int[] tickets, int p) {
		long times = 0;
		// creating this array to check whether the *person i* buy tickets less
		// than *person p*
		int[] temp = Arrays.copyOf(tickets, tickets.length);
		for (int i = 0; i < tickets.length; i++) {
			temp[i] = tickets[i] - tickets[p];
		}
		for (int i = 0; i < tickets.length; i++) {
			if (temp[i] < 0)
				times += tickets[i];
			else {
				if (i <= p)
					times += tickets[p];
				else
					times += tickets[p] - 1;
			}
		}
		return times;
	}
}
