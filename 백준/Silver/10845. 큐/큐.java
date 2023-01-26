import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Deque<Integer> dq = new ArrayDeque<Integer>();
		
		int t = Integer.parseInt(br.readLine());
		String comm;
		int num = 0;
		for (int i = 0; i < t; i++) {
			String s = br.readLine();
			String[] arr = s.split(" ");
			comm = arr[0];
			if(arr.length > 1) {
				num = Integer.parseInt(arr[1]);
			}
			if(comm.equals("push")) {
				dq.add(num);
			}
			else if(comm.equals("empty")) {
				if(dq.isEmpty()) {
					bw.write(1+"\n");
				} else {
					bw.write(0+"\n");
				}
			}
			else if(comm.equals("size")) {
				bw.write(dq.size()+"\n");
			}
			else if(comm.equals("pop")) {
				if(dq.isEmpty()) {
					bw.write(-1+"\n");
				} else {
					bw.write(dq.poll()+"\n");
				}
			}
			else if(comm.equals("front")) {
				if(dq.isEmpty()) {
					bw.write(-1+"\n");
				} else {
					bw.write(dq.peek()+"\n");
				}
			}
			else if(comm.equals("back")) {
				if(dq.isEmpty()) {
					bw.write(-1+"\n");
				} else {
					bw.write(dq.peekLast()+"\n");
				}
			}
			bw.flush();
		}
	}
}