import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException {

		int t = Integer.parseInt(br.readLine());
		bw.write("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다."+"\n");
        bw.write("\"재귀함수가 뭔가요?\""+"\n");
		bw.write("\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.\n"
				 + "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.\n"
				 + "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\""+"\n");
		String m = "____";
		String s = "";
		
		for(int i=0; i<t; i++) {
			s += m;
			if(i==(t-1)) {
				lastWrite(s);
				makeLine(t, s);
				break;

			}
			reWrite(s);
		}
	}
	
	public static void makeLine(int t, String s) throws IOException {
		StringBuilder m = new StringBuilder(s);
		for(int i=t-1; i>=0; i--) {
			m.delete(0, 4);
			if(t==1) {
				bw.write("라고 답변하였지.");
				bw.flush();
				continue;
			}
			bw.write(m+"라고 답변하였지."+"\n");
			bw.flush();
		}
	}
	public static void reWrite(String s) throws IOException {
		bw.write(s+"\"재귀함수가 뭔가요?\""+"\n");
		bw.write(s+"\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.\n"
				+ s + "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.\n"
				+ s + "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\""+"\n");
		bw.flush();
	}
	
	public static void lastWrite(String s) throws IOException {
		bw.write(s+"\"재귀함수가 뭔가요?\""+"\n");
		bw.write(s+"\"재귀함수는 자기 자신을 호출하는 함수라네\""+"\n");
		bw.write(s+"라고 답변하였지."+"\n");
		bw.flush();
	}
}