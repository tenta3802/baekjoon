import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = br.readLine();
		String[] nums = s.split(" ");
		int start = Integer.parseInt(nums[0]);
		int end = Integer.parseInt(nums[1]);
		List<Integer> list = new ArrayList<Integer>();
		int i = 1;
		int cnt = 0;
		int sum = 0;
		loop1: while (true) {
			for (int j = 0; j < i; j++) {
				if (cnt == end) {
					break loop1;
				}
				list.add(i);
				cnt++;
			}
			i++;
		}
		for (int k = start-1; k < end; k++) {
			sum += list.get(k);
		}
		bw.write(String.valueOf(sum));
        bw.flush();
	}
}