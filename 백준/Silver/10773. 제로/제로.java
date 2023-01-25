import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Stack<Integer> st = new Stack<Integer>();

		int k = Integer.parseInt(br.readLine());
		for (int i = 0; i < k; i++) {
			int num = Integer.parseInt(br.readLine());
			if (!st.empty() && num == 0) {
				st.pop();
				continue;
			}
			st.push(num);
		}
		int sum = 0;
		while(!st.empty()) {
			sum += st.pop();
		}
		String answer = String.valueOf(sum);
		bw.write(answer);
		bw.flush();
	}
}