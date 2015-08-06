import java.util.Scanner;
public class forloop3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		System.out.print("請輸入一個數");
		int n=scn.nextInt();
		int i;
		int sum = 0;
		int r = 17 - n;
		
		if(n%17 == 0){
			for(i=n;i<=1399;i=i+17){
				sum = sum + i;
			}System.out.print(sum);
		}else{
			for(i=n+r;i<=1399;i=i+17){
				sum = sum + i;
			}System.out.print(sum);
		}
		
	}

}
