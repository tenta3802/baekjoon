import java.io.IOException;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				if (o1[0] == o2[0]) {
					return Integer.compare(o1[1], o2[1]);
				}
				return Integer.compare(o1[0], o2[0]);
			}
		});
		for (int i = 0; i < t; i++) {
			pq.offer(new int[] { sc.nextInt(), sc.nextInt() });
		}
		while (!pq.isEmpty()) {
			int[] data = pq.poll();
			System.out.println(data[0]+" "+data[1]);
		}
	}
}