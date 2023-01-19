import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;

public class Main {

	private static void sort(int[] arr) {
		PriorityQueue<Integer> pq = null;
		pq = new PriorityQueue<>();
		add(pq, arr);

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) pq.remove();
		}
	}

	private static void add(PriorityQueue pq, int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			pq.add(arr[i]);
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		int[] arr = new int[t];
		for (int i = 0; i < t; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		sort(arr);
		for (int i = 0; i < arr.length; i++) {
			bw.write(String.valueOf(arr[i]));
			bw.write("\n");
		}
		bw.flush();
	}
}