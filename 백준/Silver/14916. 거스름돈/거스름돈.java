import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int money = sc.nextInt();
		int cnt = 0;

		while (true) {
			if (money % 5 == 0) {
				cnt += money / 5;
				break;
			}
			if ((money % 5) % 2 == 0) {
				cnt += money / 5;
				money %= 5;
				cnt += money / 2;
				break;
			}
			if (money < 10) {
				if ((money - 5) % 2 != 0 && money % 2 == 0) {
					cnt += money / 2;
					break;
				}
			}
			money = money - 5;
			cnt++;
			if (money <= 1) {
				cnt = -1;
				break;
			}
		}
		System.out.println(cnt);
	}
}