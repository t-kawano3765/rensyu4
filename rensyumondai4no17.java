package mondaisyu4;
import java.util.Scanner;
public class rensyumondai4no17 {

	//数値を繰り返してキーボードより入力し、
	//0 が入力されたら入力を止め、平均値を
	//画面に表示するプログラムを作成しなさい。
	//※ 最後に入力された 0 は平均に含めない。
	//少なくとも 1 回は入力が行われるものとする。（最初に 0 を入力してはいけない）
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc =new Scanner (System.in);
		 int sum =0;


		for (int i =1; i <=10 ;i++) {
			int x = sc.nextInt();
			if (x!=0) {
				System.out.println(i+"回目の入力");
				sum =sum+x;
				//System.out.println(sum);
			}
			
			else if (i==1&&x==0) {
				System.out.println(i+"回目の入力は0以外の値を入力して下さい。");
				i=0;
				continue;
			}
		}
		System.out.println("10回入力した値の総合計は"+sum+"です。");
		System.out.println("平均値は"+sum/10+"です。");
	}
}
