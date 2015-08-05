import java.util.Scanner;
public class Triangle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		System.out.print("請輸入最短邊");
		int S=scn.nextInt();
		System.out.print("請輸入最長邊");
		int L=scn.nextInt();
		System.out.print("請輸入剩餘一邊");
		int M=scn.nextInt();
		
		if(S * S + M * M > L * L){
			System.out.print("銳角三角形");
		}else{
			if(S * S + M * M == L * L){
				System.out.print("直角三角形");
			}else{
				System.out.print("鈍角三角形");
			}
		}
		
	}

}
