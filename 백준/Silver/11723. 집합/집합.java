import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		Set<Integer> set = new LinkedHashSet<Integer>();
		int n = Integer.parseInt(br.readLine());
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
		for (int i = 0; i < n; i++) {

			String co = br.readLine();
			st = new StringTokenizer(co, " ");
			while (st.hasMoreTokens()) {
				String comm = st.nextToken();
				int num = 0;
				if (st.countTokens() == 1) {
					num = Integer.parseInt(st.nextToken());
				}
				if (comm.equals("add")) {
					set.add(num);
				} else if (comm.equals("check")) {
					if (set.contains(num)) {
						bw.write("1");
					} else {
						bw.write("0");
					}
					bw.write("\n");
				} else if (comm.equals("remove")) {
					set.remove(num);
				} else if (comm.equals("toggle")) {
					if (set.contains(num)) {
						set.remove(num);
					} else {
						set.add(num);
					}
				} else if (comm.equals("all")) {
					set.addAll(list);
				} else if (comm.equals("empty")) {
					set.clear();
				}
			}
		}
		bw.flush();
	}
}