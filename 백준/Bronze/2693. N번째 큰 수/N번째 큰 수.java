import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> pq;

		for (int i = 0; i < t; i++) {
			pq = new PriorityQueue<Integer>();
			String s = br.readLine();
			String[] arr = s.split(" ");
			for (String num : arr) {
				pq.offer(Integer.parseInt(num));
			}
			int cnt = 1;
			while (!pq.isEmpty()) {
				if (cnt == 11) {
					cnt = 1;
				}
				if (cnt == 8) {
					int num = pq.poll();
					bw.write(num+"\n");
				}
				pq.poll();
				cnt++;
			}
		}
		bw.flush();
	}
}