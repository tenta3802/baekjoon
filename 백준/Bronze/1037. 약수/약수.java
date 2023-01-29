import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		List<Integer> list = new ArrayList<Integer>();
		String a = br.readLine();
		String[] s = a.split(" ");
		for(int i=0; i<s.length; i++) {
			list.add(Integer.parseInt(s[i]));
		}
		Collections.sort(list);
		int leng = list.size();
		int answer = 0;
		if(leng == 1) {
			answer = list.get(0) *list.get(0);
		}
		else {
			answer = list.get(0) * list.get(leng-1);
		}
		bw.write(String.valueOf(answer));
		bw.flush();
	}
}