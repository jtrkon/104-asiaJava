import java.util.Scanner;
public class function1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		System.out.print("請輸入一整數");
		String a=scn.next();
		int sum = 0;
		char [] data = a.toCharArray();
		for(int i=0;i<data.length;i++){
			sum=sum+(data[i]-'0');
		}
		System.out.print(sum);
	}
}