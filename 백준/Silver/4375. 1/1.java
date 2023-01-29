import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String num;
		while ((num = br.readLine()) != null) {
			try {
				long nn = Long.parseLong(num);
				long ss = 1;
				int cnt = 1;
				while(ss%nn!=0) {
					ss = (ss*10+1)%nn;
					cnt++;
				}
				bw.write(String.valueOf(cnt)+"\n");
				bw.flush();
			} catch (NumberFormatException e) {
				break;
			}
		}
	}
}