import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.EmptyStackException;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Stack<Integer> stack = new Stack<Integer>();
		int t = Integer.parseInt(br.readLine());
		
		for(int i=0; i<t; i++) {
			String[] arr = br.readLine().split(" ");
			if(arr[0].equals("push")) {
				stack.push(Integer.parseInt(arr[1]));
				
			}
			if(arr[0].equals("top")) {
				try {
					bw.write((int) stack.peek()+"\n");
					} catch(EmptyStackException e) {
						bw.write(-1+"\n");
					}
			}
			if(arr[0].equals("size")) {
				bw.write((int) stack.size()+"\n");
			}
			if(arr[0].equals("empty")) {
				if(stack.empty()) {
					bw.write(1+"\n");	
				} else
					bw.write(0+"\n");
			}
			if(arr[0].equals("pop")) {
				try {
					bw.write((int) stack.peek()+"\n");
				stack.pop();
				} catch(EmptyStackException e) {
					bw.write(-1+"\n");
				}
			}
			bw.flush();
		}
	}
}